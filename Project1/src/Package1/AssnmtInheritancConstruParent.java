package Package1;

public class AssnmtInheritancConstruParent 
{
	public AssnmtInheritancConstruParent()
	{
		this(3,4,8);
		System.out.println("Parent defautl constructor");
	}
	public AssnmtInheritancConstruParent(int a)
	{
		this(3,4);
		System.out.println("Parent one parameterized constructor");
	}
	public AssnmtInheritancConstruParent(int b,int c)
	{
		this(3,4,5,6);
		System.out.println("Parent two parameterized constructor");
	}
	public AssnmtInheritancConstruParent(int d,int e,int f)
	{
		
		System.out.println("Parent three parameterized constructor");
	}
	public AssnmtInheritancConstruParent(int g,int h,int i,int j)
	{
		this();
		System.out.println("Parent four parameterized constructor");
	}
	
}
