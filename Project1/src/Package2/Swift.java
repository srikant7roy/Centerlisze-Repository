package Package2;

import Package1.Maruti;

public class Swift extends Maruti
{
	public void m2()
	{
		System.out.println("I am parent class");
	}
	public static void main(String[] args) 
	{
		Swift s=new Swift();
		s.m1(); // able to call the parent method.
		s.m2(); // able to call the own method.
		s.price=122; // able to call the parent variable.
		System.out.println(s.price);
	}
}
