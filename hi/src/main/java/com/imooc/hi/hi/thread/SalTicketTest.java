package com.imooc.hi.hi.thread;

//import org.junit.Test;

public class SalTicketTest {

//	@Test
	public void execute() {
		SalTicketsRunn sal = new SalTicketsRunn();
		new Thread(sal).start();
		new Thread(sal).start();
	}
}
