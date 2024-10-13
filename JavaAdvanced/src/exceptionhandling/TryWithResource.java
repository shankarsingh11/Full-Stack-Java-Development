package exceptionhandling;

import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		   
		// resource always use autocloaseable
		// resource autocloseable after try block
		try(Scanner sc = new Scanner(System.in);) {
			System.out.println("Hello");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
