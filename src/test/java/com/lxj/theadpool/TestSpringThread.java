package com.lxj.theadpool;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class TestSpringThread {
//	格式化时间
	static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SSS");
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ThreadPoolTaskExecutor executor = (ThreadPoolTaskExecutor) context.getBean("executor");
		
		System.out.println("开始时间：" + dateFormat.format(new Date()));
		try {
			for(int i=0;i<6;i++) {
				executor.execute(new Task());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			context.close();
		}
						
			
		
	}
}
