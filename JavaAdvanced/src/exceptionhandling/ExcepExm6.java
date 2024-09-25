package exceptionhandling;

import java.util.Scanner;

class Alpha1
{
	void alpha1() throws ArithmeticException
	   { 
		
		    Scanner sc = new Scanner(System.in);
		    try {
			System.out.println("Connection to Calc App is established : ");
			System.out.println("Enter the First number to divide");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number to divide");
			int num2 = sc.nextInt();
			int rs = num1/num2;
			System.out.println("Result is : " + rs);
		    }
		    catch(ArithmeticException ae) {
			System.out.println("Exception handle in alpha1 only ");
		    }
		    System.out.println("Connection is terminated");
	   }	
}


public class ExcepExm6 {

	public static void main(String[] args) {
		try {
		System.out.println("Main method Connetion");
		Alpha1 a1 = new Alpha1();
		a1.alpha1();
		}
		catch(ArithmeticException ae)
		{
		System.out.println("Connection terminated in main");
		}
		
	}

}
