package Package1;

public class ImplicitExplicit 
{
	public static void main(String[] args) 
	{
		int a=10;
		System.out.println(a);
		float f;
		f=a; // Implicit conversion
		System.out.println("Implicit conversion "+f);
		float m=100.09f;
		System.out.println(m);
		int z;
		z=(int)f; // Explicit conversion
		System.out.println("Explicit conversion "+z);
		
	}
}
