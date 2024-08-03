package StringProg;

import java.util.Arrays;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter String Value: ");
		String str  = scan.nextLine();
		boolean flag =false;		
		str = str.replace(" ", "");
		str =str.toUpperCase();
        char[] ch1 = str.toCharArray();
		Arrays.sort(ch1);
		int[] arr= new int[26];
		for(int i = 0;i<ch1.length;i++) {
			int index = ch1[i]-65;
			arr[index]++;
		}
		System.out.println("Existing Arrays Values");
		
	      for(int i = 0;i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
						 
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i] == 0) {
				flag = true;
				break;
			}
		}
	    System.out.println();
		
		if(flag == true) {
			System.out.println("It's not pangram");
		}else {
			System.out.println("It's pangram");
		}
	}
}
