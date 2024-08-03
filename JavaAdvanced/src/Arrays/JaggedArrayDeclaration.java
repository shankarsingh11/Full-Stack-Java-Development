package Arrays;

import java.util.*;

public class JaggedArrayDeclaration {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [][] ar = new int[3][];
		ar[0] = new int[3];
		ar[1] = new int [4];
		ar[2] = new int [2];
		for(int i = 0;i<ar.length;i++) {
	          for(int j = 0;j<ar[i].length;j++) {  
	        	  System.out.println("Enter a marks of class " + i + "  Student " + j);  
	        	ar[i][j] =   scan.nextInt();  
	          }
	          System.out.println();
		}		
		System.out.println("The marks of students are ");
		for(int i = 0;i<ar.length;i++) {			
	          for(int j = 0;j<ar[i].length;j++) {	        	  
	        	System.out.print(ar[i][j] + "  "); 	        	  
	          }          
	          System.out.println();
		}				
	}
}
