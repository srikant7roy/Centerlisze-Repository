package Package1;

public class Student 
{		// {} indicate boundary(body) of the class
	int a;		// is a variable which will store integer value
	public void display()		//method name --display() indicate method
	{
		System.out.println("This java first program");
	}
	public static void main(String[] args)
	{
		Student srikant=new Student(); // Third pillar
		srikant.display();
		srikant.display();
		srikant.a=01;
		System.out.println(srikant.a);
		srikant.a=02;
		System.out.println(srikant.a);
	}
}
