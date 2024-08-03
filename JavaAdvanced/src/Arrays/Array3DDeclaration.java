package Arrays;

import java.util.*;

public class Array3DDeclaration {
	
	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    
		int [][][] arr = new int [2][3][4];
		
		for(int i = 0 ; i<arr.length;i++) {
			for(int j = 0 ;j<arr[i].length;j++) {
				for(int k = 0; k<arr[i][j].length;k++) {					
					System.out.println("Enter the marks of college " + i + " class " + j + " student " + k);
					arr[i][j][k] = scan.nextInt();					
				}
				System.out.println();				
			}
			System.out.println();
		}					
		for(int i = 0 ; i<arr.length;i++) {
			for(int j = 0 ;j<arr[i].length;j++) {
				for(int k = 0; k<arr[i][j].length;k++) {
					
				System.out.println("Marks stored are as fellows : ");
				System.out.print(arr[i][j][k] + " ");
					
				}
				System.out.println();
			}
			
			System.out.println();
		}		
				
	}

}
