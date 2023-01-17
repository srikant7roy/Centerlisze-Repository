package Package1;

import java.io.IOException;

public class Debugging 
{
	public void method1()
	{
		System.out.println("First print m1");
		System.out.println("second print m1");
		System.out.println("Third print m1");
	}
	public void method2()
	{
		System.out.println("First print m2");
		System.out.println("second print m2");
		System.out.println("Third print m2");
	}
	public static void main(String[] args) throws IOException
	{
		
		System.out.println("I am main method");
		System.out.println("code debugging");
		Debugging d=new Debugging();
		d.method1();
		System.out.println("Calling first method");
		d.method2();
		System.out.println("calling second method");
	}
	
}
