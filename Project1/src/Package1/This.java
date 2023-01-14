package Package1;

public class This 
{
	public This()
	{
		System.out.println("default constructor");
	}
	public This(int a)
	{
		this(20,30);
		System.out.println("one paramiterized constructor");
	}
	public This(int a1, int b1)
	{
		System.out.println("two paramiterized constructor");
	}
	public static void main(String[] args) 
	{
		This cons=new This(45); // control will go on one parameterized.
		
	}
}
