package exceptionhandling;

import java.util.Scanner;
class Alpha
{
   void alpha() throws ArithmeticException
   { 
	    Scanner sc = new Scanner(System.in);
		System.out.println("Connection to Calc App is established : ");
		System.out.println("Enter the First number to divide");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number to divide");
		int num2 = sc.nextInt();
		int rs = num1/num2;
		System.out.println("Result is : " + rs);
		System.out.println("Connection is terminated ");
		
   }	
}

class Beta
{
   void beta() throws ArithmeticException
   {
	   Alpha a = new Alpha();
	   a.alpha();
   }
}

public class ExcepExm3 {

	public static void main(String[] args) {
		
		try {
		Beta b = new  Beta();
		b.beta();
		}
		catch(Exception e)
		{
			System.out.println("Exception finally handle in main");	
		}
	}

}
