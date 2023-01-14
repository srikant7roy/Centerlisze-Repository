package Package1;

public class Arithmetic3 
{
	public int mul(int a, int b)
	{
		int c=a*b;
		System.out.println("(10*2)="+c);
		return c;
	}
	public int sub(int a1, int b1)
	{
		int c1=a1-b1;
		System.out.println("((10*2)-2)="+c1);
		return c1;
	}
	public int add(int a2, int b2)
	{
		int c2=a2+b2;
		System.out.println("(((10*2)-2)+2)="+c2);
		return c2;
	}
	public int sub2(int a3, int b3)
	{
		int c3=a3-b3;
		System.out.println("((((10*2)-2)+2)-2)="+c3);
		return c3;
	}
	public void div(int a4, int b4)
	{
		int c4=a4/b4;
		System.out.println("(((((10*2)-2)+2)-2)/2)="+c4);
	}
	public static void main(String[] args)
	{
		Arithmetic3 obj=new Arithmetic3();
		int mul1=obj.mul(10, 2);
		int subone=obj.sub(mul1, 2);
		int add1=obj.add(subone, 2);
		int subtwo=obj.sub2(add1, 2);
		obj.div(subtwo, 2);
	}
	
}
