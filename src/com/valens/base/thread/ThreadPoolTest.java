package com.valens.base.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 */
public class ThreadPoolTest {
	
	public static void closeThreadPool(ExecutorService service){
		if(service!=null){
			service.shutdown();
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService service=null;
		// TODO Auto-generated method stub
		// Java通过Executors提供四种线程池，分别为：
		// newCachedThreadPool创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
		// service=new MyCacheThreadPool().testCacheThreadPool();
		// newFixedThreadPool 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
		// service=new MyFixedThreadPool().test();
		// newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。
		//service=new ScheduledThreadPoolTest().test();
		// newSingleThreadExecutor
		// 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
		 service=new SingleThreadExecutorTest().test();
		ThreadPoolTest.closeThreadPool(service);
	}
}

class MyCacheThreadPool {
	public ExecutorService testCacheThreadPool() {
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		for (int i = 0; i < 50; i++) {
			final int index = i;
			cachedThreadPool.execute(new Runnable() {
				public void run() {
					System.out.println("thread start:" + index + " ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("thread end:" + index);
				}
			});
		}
		return cachedThreadPool;
	}

}

class MyFixedThreadPool {
	public ExecutorService test() {
		// 每次只能最多运行3个线程
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {
			final int index = i;
			System.out.println(" thread create:" + index);
			fixedThreadPool.execute(new Runnable() {

				public void run() {
					try {
						System.out.println("thread:" + index
								+ " start will sleep:" + (index / 2));
						Thread.sleep(index / 2 * 1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("thread:" + index + " end");
				}
			});
		}
		return fixedThreadPool;
	}
}

class ScheduledThreadPoolTest {
	private static long start = System.currentTimeMillis();

	public ExecutorService test() {
		ScheduledExecutorService scheduledThreadPool = Executors
				.newScheduledThreadPool(5);
		start = System.currentTimeMillis();
		System.out.println("scheduledThread will delay !" + start);
		scheduledThreadPool.schedule(new Runnable() {
			public void run() {
				long end = System.currentTimeMillis();
				System.out.println("scheduledThread run!" + end);
				System.out.println("scheduledThread delay seconds!"
						+ (end - start));
			}
		}, 5, TimeUnit.SECONDS);

		// scheduledThreadPool.scheduleAtFixedRate(command, initialDelay,
		// period, unit)
		/*
		 * scheduledThreadPool.scheduleWithFixedDelay(new Runnable() { @Override
		 * public void run() { } }, initialDelay, period, unit);
		 */
		return scheduledThreadPool;
	}
}
/**
 * 单线程池
 * 
 * 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO先进先出, LIFO后进先出, 优先级)执行
 * @author huang_xiaohua
 *
 */
class SingleThreadExecutorTest {
	public ExecutorService test() {
		ExecutorService singleThreadExecutor = Executors
				.newSingleThreadExecutor();
		for (int i = 0; i < 10; i++) {
			final int index = i;
			singleThreadExecutor.execute(new Runnable() {
				public void run() {
					try {
						System.out.println(index);
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
		//不关闭不会停止线程,一直等待
		singleThreadExecutor.shutdown();
		 
		return singleThreadExecutor;
	}
}