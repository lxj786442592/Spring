package com.lxj.theadpool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable {
//	格式化时间用
	static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SSS");

	public void run() {
		
		try {
			String msg = "任务线程：" + Thread.currentThread().getName() 
					+ "，执行时间：" + dateFormat.format(new Date());
			Thread.sleep(500);
			msg += "~" + dateFormat.format(new Date());
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
