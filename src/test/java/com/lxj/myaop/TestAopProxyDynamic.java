package com.lxj.myaop;

import java.lang.reflect.InvocationHandler;

import java.lang.reflect.Proxy;

public class TestAopProxyDynamic {
	public static void main (String[] args){
	//目标对象
		Service service = new ServiceImpl();
	//事务管理	
		TransactionManager transactionManager = new TransactionManager();
	//动态代理	
		InvocationHandler ih = new AopProxyDynamic(service, transactionManager);
	//动态代理生成的代理对象
		Service dynamicProxy = (Service) Proxy.newProxyInstance(
				service.getClass().getClassLoader(),service.getClass().getInterfaces(),ih);
	//使用代理对象调用业务方法
		dynamicProxy.buyGoods("张三", "电视机");
		dynamicProxy.returnGoods(10005);
	}
	
}
