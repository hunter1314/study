package com.imooc.hi.hi.thread;

public class SalTicketsRunn implements Runnable{

	private int num = 100;

	Object obj = new Object();
	@Override
	public void run() {
		while(num > 0) {
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
