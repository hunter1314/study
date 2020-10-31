package com.imooc.hi.hi.thread;

/**
 * 简单线程示范
 * @author Administrator
 *
 */
public class ThreadTest {

	public static void main(String[] args) throws Exception {
		
		/*ThreadDemo1 d1 = new ThreadDemo1("d1");
		ThreadDemo1 d2 = new ThreadDemo1("d2");
		
		这里直接调用线程类的run方法就不会开启线程
		
		//start：1.开启线程，调用线程类的run()
		d1.start();
		d2.start();
		d1.run();
		d2.run();*/
		
		SalTickets s = new SalTickets();
		//线程和要运行的任务代码解耦
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		t1.start();
		Thread.sleep(100);
		//s.flag = false;
		t2.start();
		
	}
}
