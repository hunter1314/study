package designPattern.decoration;

public class DecorateTest01 {

	public static void main(String[] args) {
		Human dhu = new Human();
		HumanA ha = new HumanA();
		HumanB hb = new HumanB();
		
		ha.setHuman(dhu);
		hb.setHuman(ha);
		hb.operate();
	}
}
