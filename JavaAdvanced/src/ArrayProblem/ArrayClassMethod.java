package ArrayProblem;

import java.util.Arrays;

public class ArrayClassMethod {

	public static void main(String[] args) {
		
		
		 // Arrays Class  All Method 
		 
		/*
		int [] arr = {20,30,10,50,90,40,80,70};
		
		System.out.println("before sorting ");
		
		for(int i = 0;i<arr.length;i++) {
               System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		*/
		
		/*
		
		Arrays.sort(arr);
		
		System.out.println("After sorting ");
		
		for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
		}
		
		*/
		
		/*
		
		int [] ar = new int[5];
		
		System.out.println("before fill method ");
		
		for(int i = 0;i<ar.length;i++) {
            System.out.print(ar[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("After fill method");
		
		Arrays.fill(ar, 5);
		
		for(int i = 0;i<ar.length;i++) {
            System.out.print(ar[i] + " ");
		}
		
		*/
		
		
		
	 /*	
		int[] a = {20,30,0,0,0,50,80,70};
		
		Arrays.fill(a,2,5,10);  // Arrays.fill(arrayName,includeIndex,excludeIndex,value)
		
		for(int i = 0;i<a.length;i++) {
            System.out.print(a[i] + " ");
		}
		
		*/
		
		System.out.println();
		
		int key = 100;
		int array [] = {20,40,10,30,60,90,50,70,60};
		
		Arrays.sort(array);
		
		int res = Arrays.binarySearch(array, key);  // -(index+1)
		
		System.out.println(res);
		
		
		
	}

}
