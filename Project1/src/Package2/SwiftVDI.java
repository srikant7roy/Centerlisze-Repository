package Package2;

public class SwiftVDI extends Swift
{
	public void m3()
	{
		System.out.println("I am child class");
	}
	public static void main(String[] args) 
	{
		SwiftVDI s=new SwiftVDI();
		s.m1();
		s.m2();
		s.m3();
		s.price=1000;
		System.out.println("Prant class variable inherited "+s.price);
	}
}
