package com.lxj.springAop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAop {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		GoodsService service = (GoodsService) context.getBean("service");
		
		service.buyGoods("张三", "劳力士");
		service.returnGoods(10008);
		
		context.close();

	}

}
