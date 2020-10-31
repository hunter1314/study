package com.imooc.hi.hi.thread.runnable;

import java.util.ArrayList;
import java.util.List;

//import org.junit.Test;

public class RunnableTest01 {

	class Run1 implements Runnable{

		private String name;
		public Run1(String n) {
			this.name = n;
		}
		
		@Override
		public void run() {
			for(int i=0; i<50; i++) {
				System.out.println(name+"::"+i);
			}
		}
		
	}
	
//	@Test
	public void test() {
		
		List<Runnable> list = new ArrayList<Runnable>();
		
		list.add(new Run1("a"));
		list.add(new Run1("b"));
		
		for(int i=0; i<list.size(); i++) {
			new Thread(list.get(i)).start();
		}
	}
}
