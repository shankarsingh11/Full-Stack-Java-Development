package SortingAlgo;

public class BubbleSort {
	

	public static void main(String[] args) {
	
		// bubble Sort Algorithm
		
		int[] arr = {7,4,6,3,2,1,8,0};
		
		for(int i =0;i<arr.length;i++) {
			
			for(int j = 0;j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(  arr[i] + " ");
		}
			

	}

}
