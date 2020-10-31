package com.imooc.hi.hi.thread;
/**
 * 同步嵌套，死锁
 * @author Administrator
 *
 */
public class DeadLockThead implements Runnable{

	private int num = 300;
	
	Object obj = new Object();
    Boolean flag = true;
	@Override
	public void run() {
		if(flag)
		while(true) {
			synchronized(obj) {//同步代码块可以任意指定锁的对象
				if(num > 0) {
					sal();
				}
			}
		}
		else
			while(true)
			sal();
		
	}
	
	public synchronized void sal() {//同步函数锁的是this
		
		synchronized (obj) {
		
			if(num > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ": " + num--);
			}
		}

	}
	
}
