package Package1;

public class Student2 
{
	int Roll_NO;
	int Age;
	public void display1()
	{
		System.out.println("Welcom to all of you.");
	}
	public void display2()
	{
		System.out.println("Automation is very easy.");
	}
	public static void main(String[] args) 
	{
		Student2 assign1=new Student2();
		assign1.display1();
		assign1.display2();
		assign1.Roll_NO=01;
		System.out.println("My Roll No is "+assign1.Roll_NO);
		assign1.Age=26;
		System.out.println("My Age is "+assign1.Age);
	}
}
