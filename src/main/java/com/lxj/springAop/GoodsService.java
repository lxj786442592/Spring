package com.lxj.springAop;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class GoodsService {
	private static int ORDER_NO = 10000;      //用于生成订单编号

	public int buyGoods(String user, String productName) {
			ORDER_NO++;
			System.out.println("【数据库插入订单】购买者："+user+"，商品名称："+productName+"，订单编号："+ORDER_NO);		
		return ORDER_NO;
	}

	public void returnGoods(int orderNo) {
			System.out.println("【数据库修改订单状态】订单编号："+orderNo);
	}
}
