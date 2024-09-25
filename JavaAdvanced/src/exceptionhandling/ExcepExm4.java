package exceptionhandling;

import java.util.Scanner;

public class ExcepExm4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Connection to Calc App is established : ");
		try {
		System.out.println("Enter the First number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		int rs = num1/num2;
		System.out.println("Result is : " + rs);
		}
		catch(ArithmeticException ae) 
		{
		System.out.println("Please provide non zero denominator");
		}
		
		try {
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the inserted elem");
		int elem = sc.nextInt();
		System.out.println("Enter the pos at the elem has to be inserted ");
		int pos = sc.nextInt();
		arr[pos]=elem;
		System.out.println("Element "+ elem+ " inserted at "+pos+" Successfully ");
		}
		catch(NegativeArraySizeException nae) 
		{
			System.out.println("Please be positive !");
		}
		catch(ArrayIndexOutOfBoundsException ai) 
		{
			System.out.println("Be in your limit,Don't cross it ");
		}
		catch(Exception e)
		{
			System.out.println("Wrong Input !");
		}
		
		System.out.println("Connection is terminated");

	}

}
