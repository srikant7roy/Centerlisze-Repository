package Package1;

public class Constructor 
{
	public Constructor()
	{
		System.out.println("default constructor");
	}
	public Constructor(int a)
	{
		System.out.println("one paramiterized constructor");
	}
	public Constructor(int a1, int b1)
	{
		System.out.println("two paramiterized constructor");
	}
	public static void main(String[] args) 
	{
		Constructor cons=new Constructor(45);
		Constructor constwo=new Constructor(45,30);
		Constructor ram=new Constructor();
		
	}
}
