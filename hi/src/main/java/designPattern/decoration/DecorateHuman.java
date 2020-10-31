package designPattern.decoration;

public class DecorateHuman extends Human
{

	private Human human;
	
	public void setHuman(Human human) {
		this.human = human;
	}
	
	@Override
	public void operate() {
		if(human != null)
		{
			human.operate();
			System.out.println("decratehuman operate");	
		}
	}

}
