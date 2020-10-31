package com.imooc.hi.hi.thread;

public class TestDeadThread {

	public static void main(String[] args) {
		DeadLock2 d1 = new DeadLock2(true);
		DeadLock2 d2 = new DeadLock2(false);
		
		new Thread(d1).start();
		new Thread(d2).start();
	}
}
