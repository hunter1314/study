package designPattern.decoration;

public class HumanB extends DecorateHuman{

	@Override
	public void operate() {
		super.operate();
		System.out.println("HumanB operate");
	}
}
