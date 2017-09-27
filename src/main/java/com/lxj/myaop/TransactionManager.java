package com.lxj.myaop;
/*	
*事务管理器
*/
public class TransactionManager {
	public void beginTransaction(){
		System.out.println("【事务管理器】开始事务");
	}
	public void commitTransaction(){
		System.out.println("【事务管理器】提交事务");
	}
	public void rollback(){
		System.out.println("【事务管理器】回滚事务" );
	}
	
}
