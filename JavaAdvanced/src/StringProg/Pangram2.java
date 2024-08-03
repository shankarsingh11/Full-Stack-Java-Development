package StringProg;
import java.util.*;
class PangramProg{
	
	public String  removeSpace(String str) {
		return str = str.replace(" ","");
	}
	//  change LowerCase  to UpperCase
	
	public String lTou(String str) {
		String str2 = "";
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				str2 = str2 + (str.charAt(i)-32);
			}else {
				str2 = str2 + str.charAt(i);
			}
		}
		return str2;
	}
	
	public void swap(char[] ch, int min_index,int i) {
		   char temp = ch[min_index];
		   ch[min_index]= ch[i];
		   ch[i]= temp;
	}	
	// sort the array 
	public void arraySort(char[] ch) {
		
	for(int i =0;i<ch.length;i++) {
		int min_index = i;
		for(int j = i+1;j<ch.length;j++) {
			if(ch[j] < ch[min_index]) {
				min_index = j;
			}
		}
		if(ch[min_index]!=ch[i]) {
			swap(ch,min_index,i);
		}
	}

	}
	
	// check isPangram 	
	public boolean isPangram(char[] ch) {
		
			int[] arr = new int[26];
		boolean flag = false;
		for(int i = 0;i<ch.length;i++) {
			int index = ch[i]-65;
			arr[index]++;
			}
		
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i]== 0) {
				flag = true;
				break;
			}
		}
		
		if(flag == true) {
			return false;
		}else {
			return true;
		}
	}
}
public class Pangram2 {

	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 PangramProg p = new PangramProg();
     System.out.println("Enter String Value :");
     String str = in.nextLine();
     String ans =  p.removeSpace(str);
     String str3 = p.lTou(ans);
     char[] ch = str3.toCharArray();
     p.arraySort(ch);
     boolean res = p.isPangram(ch);
     
     if(res == true) {	 
    	 System.out.println("It's pangram"); 
     }else {
    	 System.out.println("It's not pangram");
     } 
	}
}
