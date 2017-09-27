package com.lxj.myaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AopProxyDynamic implements InvocationHandler {
	private Object target;
	private TransactionManager transactionManager;

	
	public AopProxyDynamic(Object target, TransactionManager transactionManager) {
//		super();
		this.target = target;
		this.transactionManager = transactionManager;
	}


	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//针对方法进行限制，提高AOP的灵活性
		//限制只有名称是以buy开头的方法才会被调用
		if (!method.getName().startsWith("buy")) {
			return method.invoke(target, args);
		}
		
		transactionManager.beginTransaction();
		try {
			Object returnResult = method.invoke(target, args);//invoke();相当于拦截器
			transactionManager.commitTransaction();
			return returnResult;
		} catch (Exception e) {
			e.printStackTrace();
			transactionManager.rollback();
			throw e;
		}
		
	}

}
