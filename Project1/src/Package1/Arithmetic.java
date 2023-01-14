package Package1;

public class Arithmetic 
{
	public int add(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Add of Two Nos = "+c);
		return c;
	}
	public int sub(int a1,int b1)
	{
		int c1;
		c1=a1-b1;
		System.out.println("Sub of Two Nos = "+c1);
		return c1;
	}
	public void mul(int a2, int b2 )
	{
		int c2;
		c2=a2*b2;
		System.out.println("Mul of add and sub = "+c2);
	}
	public static void main(String[] args) 
	{
		Arithmetic srikant=new Arithmetic();
		int sumofnos=srikant.add(10,12);
		int subofnos=srikant.sub(12,10);
		srikant.mul(sumofnos, subofnos);
	}
}
