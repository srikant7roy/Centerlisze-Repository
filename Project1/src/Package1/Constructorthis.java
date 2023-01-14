package Package1;

public class Constructorthis 
{
	public Constructorthis() 
	{
		this(2,5,6);
		System.out.println("Default constructor");
	}
	public Constructorthis(int a)
	{
		this();
		System.out.println("One paramiterized constructor");
	}
	public Constructorthis(int b, int c)
	{
		this(2);
		System.out.println("Two paramiterized constructor");
	}
	public Constructorthis(int d, int e, int f)
	{
		System.out.println("Three paramiterized constructor");
	}
	public Constructorthis(int g, int h, int i, int j)
	{
		this(2,3);
		System.out.println("Four paramiterized constructor");
	}
	public static void main(String[] args) 
	{
		Constructorthis thisconstrucobj=new Constructorthis(10,20,30,40);
	}
	
}
