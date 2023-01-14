package Package1;

public class SuperMehodcallingChild extends SuperMethodcallingParent
{
	public void method2()
	{
		super.method1();//for calling the parent method 
		System.out.println("I am Child");
		super.method1();//for calling the parent method 
		super.srikant=10;
		System.out.println(super.srikant); //for calling the parent variable as well
	}
	public static void main(String[] args) 
	{
		SuperMehodcallingChild smc=new SuperMehodcallingChild();
		smc.method2();
				
	}
}
