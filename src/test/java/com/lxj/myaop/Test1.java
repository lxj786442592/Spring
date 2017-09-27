package com.lxj.myaop;

public class Test1 {

	public static void main(String[] args) {
		Service service = new ServiceImpl();
		service.buyGoods("lxj", "《java从入门到放弃》");
		service.returnGoods(10001);
		

	}

}
