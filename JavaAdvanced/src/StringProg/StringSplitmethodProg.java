package StringProg;
import java.util.*;

public class StringSplitmethodProg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String value : ");
		String str1 = scan.nextLine();
		String str2 = "";
		System.out.println("Original Stringh :" + str1);
		String sarr[] = str1.split(" ");	
		
		// ineuron java ==> avaj norueni 
		
		for(String elem : sarr) {
			
			  for(int i = elem.length()-1;i>=0;i--) {
				  
				  str2 = str2+elem.charAt(i);
				  }
			  
		  str2 = str2+" ";
		}				
		System.out.println("After reversing String : "+ str2);
	
		// ineuron java --> java ineuron
				
		String s2 = "";
		String ar[] = str1.split(" ");
		for(int i = ar.length-1;i>=0;i--) {
			s2 = s2 + ar[i] + " ";
		}
		
		System.out.println("After revsre words :  " + s2);
	
		
	}


}
