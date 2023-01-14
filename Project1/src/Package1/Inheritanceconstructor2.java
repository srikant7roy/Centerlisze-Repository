package Package1;

public class Inheritanceconstructor2 extends Inheritanceconstructor
{
	public Inheritanceconstructor2()
	{
		System.out.println("Child default constructor");
	}
	public Inheritanceconstructor2(int k)
	{
		System.out.println("Child one paramiterized constructor");
	}
	public Inheritanceconstructor2(int m, int n)
	{
		super(100); //Explicit Call ( It will will call parent one parameterized.)
		System.out.println("Child two paramiterized constructor");
	}
	public static void main(String[] args) 
	{
		Inheritanceconstructor2 one=new Inheritanceconstructor2(10,20);//Child two parameterized.
		
	}
}
