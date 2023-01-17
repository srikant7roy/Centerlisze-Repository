package Package1;

public final class FinalClass1 
{
	final int srikant=20;
	public final int method1(int x)
	{
		System.out.println("This is method1="+x);
		return x;
	}
	public static void main(String[] args) 
	{
		FinalClass1 f=new FinalClass1();
		int x=f.srikant;
		f.method1(10);
		System.out.println("Value of x "+x);
	}
}
