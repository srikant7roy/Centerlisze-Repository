package Package1;

import java.util.Scanner;

public class ScannerClassTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter values");
		Scanner s=new Scanner(System.in);// has a relationship
		int a=s.nextInt();
		System.out.println("value of a "+a);
		System.out.println("Enter the value of f");
		float f=s.nextFloat();
		System.out.println("value of f "+f);
	}
}
