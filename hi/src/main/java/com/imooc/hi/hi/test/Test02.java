package com.imooc.hi.hi.test;

public class Test02 {

	public static void main(String[] args) {
		StringBuffer a1 = new StringBuffer();
		a1.append("hello");
		test(a1);
		System.out.println(a1);
	}
	
	private static void test(StringBuffer sb) {
		//sb.append("adcv");
		StringBuffer sb2 = new StringBuffer("hy");
		sb = sb2;
	}
}
