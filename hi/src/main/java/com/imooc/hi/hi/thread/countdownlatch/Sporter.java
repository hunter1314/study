package com.imooc.hi.hi.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Sporter implements Runnable{

	private String name;
	private CountDownLatch begin;
	private CountDownLatch end;
	
	public Sporter(String n, CountDownLatch b, CountDownLatch e) {
		this.name = n;
		this.begin = b;
		this.end = e;
	}

	@Override
	public void run() {
		try {
			begin.await();
			System.out.println("sport:" + name + " 开始起跑");
			Thread.sleep(1000);
			System.out.println("sport:" + name + " 抵达终点");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			end.countDown();
		}
		
	}
	
}
