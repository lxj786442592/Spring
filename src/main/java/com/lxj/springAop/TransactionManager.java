package com.lxj.springAop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TransactionManager {
	
	@Before("execution( * com.lxj.springAop.*Service.*(..))")
	public void beginTransaction(){
		System.out.println("【事务管理器】开始事务");
	}
	
	@AfterReturning("execution( * com.lxj.springAop.*Service.*(..))")
	public void commitTransaction(){
		System.out.println("【事务管理器】提交事务");
	}
	
	@AfterThrowing("execution( * com.lxj.springAop.*Service.*(..))")
	public void rollback(){
		System.out.println("【事务管理器】回滚事务" );
	}
	
}
