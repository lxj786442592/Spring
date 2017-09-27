package com.lxj.theadpool;


import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;




@SuppressWarnings("unused")
public class Test1 {

	public static void main(String[] args) {
		/*
		 * newSingleThreadExecutor() 
		 * 创建一个单线程的线程池。该线程只有一个线程工作，即单线程串行执行所有任务。
		 * 如果这个唯一的线程以为异常结束，则会自动创建一个新的线程来接替它。 
		 * 此线程保证所有任务的执行顺序按照任务的提交顺序执行。
		 */
//		ExecutorService executor = Executors.newSingleThreadExecutor();

		
		/*
		 * newFixedThreadPool(int nTreads)
		 * 创建nTreads参数指定大小的线程池，每次提交一个任务就创建一个线程，知道线程达到线程池的最大大小。
		 * 线程池一旦达到最大值就会保持不变，此时如果有新的任务提交，则排队等待。 
		 * 如果某个线程因为执行异常而结束，那么线程池会补充一个新的线程。
		 */
//		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		
		/*
		 * newCachedThreadPool()
		 * 创建一个可缓存的的线程池。如果线程池的大小超过了处理任务所需的线程，那么就会会回收部分空闲（超过60s不执行任务）的线程。
		 * 当任务数增加时，此线程池又可以智能地添加新线程来处理任务。
		 * 此线程池不会对线程池做限制，其能够创建的最大线程数量取决于当期平台。
		 */
//		ExecutorService executor = Executors.newCachedThreadPool();

		
		/*
		 * newSingleThreadScheduledExecutor()
		 * 创建一个单线程的线程池，支持任务调度，可以在指定的延时后或周期性执行线程任务
		*/
//		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
		
		
		/*
		 * newScheduledThreadPool(int corePoolSize)
		 * 创建corePoolSize参数所指定大小的线程池，支持任务调度，可以在指定延时后或周期性执行线程任务。
		 * 执行任务完毕后即使线程是空闲的也被保存在线程池内。
		*/
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
		
		
		System.out.println(new Date());
		for (int i = 0; i < 6; i++) {
//			executor.submit(new Task());// 执行新任务
			executor.schedule(new Task(), 1000, TimeUnit.MILLISECONDS);
		}
		executor.shutdown();// 关闭线程池
	}
}
