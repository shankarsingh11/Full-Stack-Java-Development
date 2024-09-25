package exceptionhandling;

import java.util.Scanner;

public class ExceptionExm1 {

	public static void main(String[] args) {
		
		
		System.out.println("Connection to Calc App established : ");
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		int rs = num1/num2;
		System.out.println("Result is : " + rs);
		}
		catch(Exception e) {
		System.out.println("You are trying to divide by zero illogical");
		}
		
		System.out.println("Connection is terminated");

	}

}
