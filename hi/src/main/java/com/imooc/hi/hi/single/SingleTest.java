package com.imooc.hi.hi.single;

public class SingleTest {

	public static void main(String[] args) {
		
		//懒汉式
		SingleTep s1 = SingleTep.getInstance1();
		SingleTep s2 = SingleTep.getInstance1();
		//饿汉式
		SingleTep s3 = SingleTep.getInstance2();
		SingleTep s4 = SingleTep.getInstance2();
		
		s1.setName("韩特");
		s2.setName("hante");
		
		s3.setName("韩特2");
		s4.setName("hante2");
		
		System.out.println(s1.getName());
		if(s1 == s2) {			
			System.out.println("s1和s2是同一个实例对象");
		}
		
		if(s3 == s4) {			
			System.out.println("s3和s4是同一个实例对象");
		}
		
		if(s1 != s4) {			
			System.out.println("s1和s4不是同一个实例对象");
		}
	}
}
