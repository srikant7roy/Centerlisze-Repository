package Package1;

public class Student3 
{	//	{} That indicate boundary(body) of the class.
	
	int a; // This is a variable it will store integer value.
	
	public void abc() // method name abc and () indicates it is a method.
	{	// {} Boundary of the method.
		System.out.println("Welcome to all of you");
	}
	public static void main(String[] args)
	{
		Student3 srikant=new Student3();
		srikant.abc(); // . Keyword used for calling.
		srikant.abc();
		srikant.a=10;
		System.out.println("Value of a "+srikant.a); // + is used for concat.
		srikant.a=1000;
		System.out.println("Value of a "+srikant.a); 
	}
}
