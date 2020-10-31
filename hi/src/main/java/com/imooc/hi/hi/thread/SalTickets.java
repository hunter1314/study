package com.imooc.hi.hi.thread;

public class SalTickets extends Thread {

	//不建议共享数据变成静态的，虽然这样不会出错。
	private int num = 100;
	
	Object obj = new Object();
	public void run() {
		while(true) {
			synchronized (obj) {
				if(num > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + ":" + num--);
				}
			}
		}
	}
}
