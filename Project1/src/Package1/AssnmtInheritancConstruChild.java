package Package1;

public class AssnmtInheritancConstruChild extends AssnmtInheritancConstruParent
{
	public AssnmtInheritancConstruChild()
	{
		this(1,2);
		System.out.println("Child default constructor");
	}
	public AssnmtInheritancConstruChild(int a)
	{
		this(4,5,6,7);
		System.out.println("Child one parameterized constructor");
	}
	public AssnmtInheritancConstruChild(int a,int b)
	{
		super(1);
		System.out.println("Child two parameterized constructor");
	}
	public AssnmtInheritancConstruChild(int c,int d,int e)
	{
		this(1);
		System.out.println("Child three parameterized constructor");
	}
	public AssnmtInheritancConstruChild(int f,int g,int h,int i)
	{
		this();
		System.out.println("Child four parameterized constructor");
	}
	public static void main(String[] args) 
	{
		AssnmtInheritancConstruChild assgn=new AssnmtInheritancConstruChild(2,3,4);
	}
	
}
