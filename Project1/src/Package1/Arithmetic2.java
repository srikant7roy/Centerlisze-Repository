package Package1;

public class Arithmetic2 
{
	public int add(int a, int b)
	{
		int c=a+b;
		System.out.println("Add c(10+2)= "+c);
		return c;
	}
	public int add1(int a1, int b1)
	{
		int c1=a1+b1;
		System.out.println("Add c1((10+2)+2)= "+c1);
		return c1;
	}
	public int sub(int a2, int b2)
	{
		int c2=a2-b2;
		System.out.println("sub c2(((10+2)+2)-2)= "+c2);
		return c2;
	}
	public int mul(int a3, int b3)
	{
		int c3=a3*b3;
		System.out.println("mul c3((((10+2)+2)-2)*2)= "+c3);
		return c3;
	}
	public void div(int a4, int b4)
	{
		int c4=a4/b4;
		System.out.println("div c4(((((10+2)+2)-2)*2)/2)= "+c4);
	}
	public static void main(String[] args) {
		{
			Arithmetic2 srikant=new Arithmetic2();
			int addone=srikant.add(10, 2);
			int addtwo=srikant.add1(addone, 2);
			int subone=srikant.sub(addtwo, 2);
			int mulone=srikant.mul(subone, 2);
			srikant.div(mulone, 2);
		}
	}
}
