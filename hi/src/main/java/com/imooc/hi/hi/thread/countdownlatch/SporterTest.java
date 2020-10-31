package com.imooc.hi.hi.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

//import org.junit.Test;

public class SporterTest {
	
//	@Test
	public void test() {
		
		CountDownLatch begin = new CountDownLatch(1);
		CountDownLatch end = new CountDownLatch(10);
		
		for(int i=0; i<10; i++) {
			System.out.println("sport:name" + i + " 准备好了");
			new Thread(new Sporter("name"+i, begin, end)).start();
		}
		
		System.out.println("裁判说：各就位！！！！！");
		begin.countDown();
		try {
			end.await();
			System.out.println("all end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
