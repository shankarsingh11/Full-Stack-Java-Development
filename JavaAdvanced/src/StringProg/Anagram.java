package StringProg;

import java.util.*;
import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String Value 1 : ");
		String s1 = scan.nextLine();
		System.out.println("Enter a String Value 2 : ");
		String s2 = scan.nextLine();
		
		s1 = s1.replace(" ","");
		s2 = s2.replace(" ","");
		
		s1 = s1.toLowerCase();
		s2= s2.toLowerCase();
		
		
		char[] ch1 = s1.toCharArray();
		char[] ch2  = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("It's Anagram ");
		}else {
			System.out.println("It's not Anagram ");
		}
		
		
	}

}
