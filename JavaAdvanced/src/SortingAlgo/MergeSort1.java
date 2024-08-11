package SortingAlgo;

import java.util.*;

public class MergeSort1 {
	
	public static int[] mergesort(int[] arr) {
		
		if(arr.length==1) return arr;
		
		int mid = (arr.length)/2;
		
		int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
		int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
		
		return merge(left,right);
	}

	private static int[] merge(int[] left, int[] right) {
		
		int[] mix = new int[left.length + right.length];
		
		int i = 0;
		int j=0;
		int k = 0;
		
		while(i<left.length && j<right.length) {
			if(left[i] < right[j]) {
				mix[k++] = left[i++];
			}else {
				mix[k++]= right[j++];
			}
		}
		
		while(i<left.length) {
			mix[k++] = left[i++];
		}
		
		while(j<right.length) {
			mix[k++] = right[j++];
		}
		
		return mix;
		
	}

	public static void main(String[] args) {
	
		int[] arr = {2,4,1,7,5,9,0,8};
		System.out.println("original array");
		System.out.println(Arrays.toString(arr));
		int[] ans = mergesort(arr);
		System.out.println("sorted array");
		System.out.println(Arrays.toString(ans));
		System.out.println("Print  sorted array using for each loop");
		for(int elem:ans) {
			System.out.print(" " + elem);
		}

	}

}
