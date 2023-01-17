package Package1;

import java.util.Scanner;

public class FinalClass2 // extends FinalClass1 (we can't extend)
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Value");
		Scanner scan=new Scanner(System.in);
		int s=scan.nextInt();
		System.out.println("Value of s "+s);
	}
}
