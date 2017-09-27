package com.lxj.myaop;
	
/*
*	业务接口
*/
public interface Service {
/*
*	购买商品，并生成订单
*	@param user          购买者
*	@param productName   商品名称
*	@return 			   订单编号
*/
	int buyGoods(String user,String productName);
/*	
	申请退货
	@param orderNo    要退货的订单编号
*/
	void returnGoods(int orderNo);
}
