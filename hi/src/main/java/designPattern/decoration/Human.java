package designPattern.decoration;

public class Human {

    public static void main(String[] args) {
        Integer ii = new Integer(10);
        test(ii);
        System.out.println(ii);
    }
	private static void test(Integer ii) {
        ii++;
        
        System.out.println("test   " + ii);
    }
    public void operate() 
	{
		System.out.println("======Human operate");
	};
}
