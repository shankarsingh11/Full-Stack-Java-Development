package StringProg;
import java.util.*;

public class StringsReverse {

	public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the String value :");
   String str1 = scan.nextLine();
   String str2 ="";
   for(int i = str1.length()-1;i>=0;i--) {
	   str2 = str2 + str1.charAt(i);
	   
   }
   System.out.println("original String : "+str1);
   System.out.println(" After Reverse String : "+str2);
	}

}
