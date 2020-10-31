package com.imooc.hi.hi.thread;

//线程类要实现Runnable接口，这里继承的Thread已经实现了该接口了
public class ThreadDemo1 extends Thread {

	private String name;
	
	public ThreadDemo1(String str) {
		this.name = str;
	}
	
	public void run() {
		 for(int i=0; i<10; i++) {
			 System.out.println(Thread.currentThread().getName()+" : "+i);
		 }
	 }
	 
}
