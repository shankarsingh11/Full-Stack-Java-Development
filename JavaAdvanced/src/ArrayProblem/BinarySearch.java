package ArrayProblem;

import java.util.Arrays;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		
		// binary search apply only in sorted form array 
		
		int[] arr = {20,40,10,30,90,60,80,50,70};
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the key to be searched ");
		
		int key = scan.nextInt();
		int low = 0;
		int high = arr.length-1;
		
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			
			if(key == arr[mid]) {
				System.out.println("key " + key + " found in index " + mid);
				break;
			}
			 
			else if(key <arr[mid]) {
				high = mid-1;
			}
			
			else if(key>arr[mid]) {
				low = mid+1;
			}
			
			
		}
		
		if(low>high) {
			System.out.println("Not found a key");
		}
		

	}

}
