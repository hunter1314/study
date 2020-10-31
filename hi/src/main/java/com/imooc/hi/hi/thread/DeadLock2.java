package com.imooc.hi.hi.thread;
/*
 * 同步嵌套
 */
public class DeadLock2 implements Runnable{

    Boolean flag = null;
    
    DeadLock2(Boolean flag) {
    	this.flag = flag;
    }
	@Override
	public void run() {
		if(flag)
			while(true) {
				synchronized(MyLock.LOCKA) {//同步代码块可以任意指定锁的对象
					System.out.println("if......lockA");
					synchronized (MyLock.LOCKB) {
						System.out.println("if......lockB");
					}
				}
			}
		else
			while(true) {
				synchronized(MyLock.LOCKB) {//同步代码块可以任意指定锁的对象
					System.out.println("else......lockB");
					synchronized (MyLock.LOCKA) {
						System.out.println("else......lockA");
					}
				}
			}
			
	}

}
