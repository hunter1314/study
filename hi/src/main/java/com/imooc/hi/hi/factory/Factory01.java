package com.imooc.hi.hi.factory;

public class Factory01 implements Interface01{

	@Override
	public void run1() {
		System.out.println("run1");
	}

	public void run2() {
		System.out.println("run2");
	}
	
	public static void main(String[] args) {
		Interface01 ii = new Factory01();
		ii.run1();
	}
	
}
