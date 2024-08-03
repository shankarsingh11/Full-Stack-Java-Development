package Arrays;

import java.util.Scanner;

public class ArrayError {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// Array in java guarded with boundaries
		
		 arr[3] = 40;// leads ArrayIndexOutOfBoundsException during runtime
		 
		 System.out.println("Statement after array");
		 

	}

}
