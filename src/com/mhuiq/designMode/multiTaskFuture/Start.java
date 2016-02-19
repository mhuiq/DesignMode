package com.mhuiq.designMode.multiTaskFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Start {
	
	public static void main(String[] args) throws Exception {
		FutureTask<String> future = new FutureTask<String>(new RealData("name"));
		ExecutorService executor = Executors.newFixedThreadPool(1);
		executor.submit(future);
		System.out.println("请求完毕");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("线程睡眠结束");
		System.out.println("数据：" + future.get());
	}
	
}
