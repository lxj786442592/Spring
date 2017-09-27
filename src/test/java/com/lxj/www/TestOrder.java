package com.lxj.www;




import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestOrder {

	public static void main(String []args){

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("bean.xml");
	Order order = (Order) context.getBean("order");
//		order注入
//		System.out.println(order.getId());
//		System.out.println(order.getOrderNum());
//		System.out.println(order.getAmount());
//		System.out.println(order.getOrderItem());
//		System.out.println(order.getMyMap());
//		System.out.println(order.getMyProp());
		Date orderDate = order.getOrderDate();
		orderDate.time();
		
//		orderItem注入
//		OrderItem orderItem = order.getOrderItem();
//		System.out.println(orderItem.getId());
//		System.out.println(orderItem.getProduct());
//		System.out.println(orderItem.getPrice());
//		System.out.println(orderItem.getCount());
		
		context.close();
	}
}
