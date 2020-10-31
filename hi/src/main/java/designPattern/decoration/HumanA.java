package designPattern.decoration;

public class HumanA extends DecorateHuman{

	@Override
	public void operate() {
		super.operate();
		System.out.println("HumanA operate");
	}
}
