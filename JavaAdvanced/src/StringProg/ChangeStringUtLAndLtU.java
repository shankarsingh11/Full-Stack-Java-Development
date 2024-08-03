package StringProg;

import java.util.*;

public class ChangeStringUtLAndLtU {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String value : ");
		String s1 = scan.nextLine();
		String s2 = "";
		
		for(int i = 0;i<s1.length();i++) {	
			 if( s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z' ) {
				 
				 s2 = s2 + (char)(s1.charAt(i)+ 32);
			 }else if(s1.charAt(i)>= 'a' && s1.charAt(i) <= 'z' ) {
				 
				 s2 = s2 + (char)(s1.charAt(i)-32);
				 
			 }else if(s1.charAt(i)>= 0 && s1.charAt(i)<='@') {
				 
				 s2 = s2 + s1.charAt(i);
				 
			 }else if(s1.charAt(i) >='[' && s1.charAt(i) <='`') {
				 
				 s2 = s2 + s1.charAt(i);
				 
			 }else{
				 s2 = s2 + s1.charAt(i);
			 }
		}
		
       System.out.println(s2);
	}

}
