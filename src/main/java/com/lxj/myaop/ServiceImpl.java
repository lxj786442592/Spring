package com.lxj.myaop;
/*
业务类（未使用AOP完成事务功能）
*/
public class ServiceImpl implements Service {
	private static int ORDER_NO = 10000;      //用于生成订单编号

	public int buyGoods(String user, String productName) {
		try {
			ORDER_NO++;
			System.out.println("【数据库插入订单】购买者："+user+"，商品名称"+productName+"，订单编号："+ORDER_NO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ORDER_NO;
	}

	public void returnGoods(int orderNo) {
		try {
			System.out.println("【数据库修改订单状态】订单编号："+orderNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
