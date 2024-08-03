package SortingAlgo;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {7,5,4,1,3};
		
		for(int i = 0;i<arr.length;i++) {
			int min_index = i;
			
			for(int j = i+1;j<arr.length;j++) {
				
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
				
			}
			
			if(arr[min_index] != arr[i]) {
				int temp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i] = temp;
			}
			
			
		}
		
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
