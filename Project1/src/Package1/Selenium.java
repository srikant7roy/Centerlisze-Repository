package Package1;

public class Selenium 
{
	public void method2()
	{
		System.out.println("I am selenium");
	}
	public static void main(String[] args) 
	{
		Automation obj=new Automation(); // Has a relationship
		obj.mehod1();
		Selenium obj2=new Selenium();
		obj2.method2();
		
	}
}
