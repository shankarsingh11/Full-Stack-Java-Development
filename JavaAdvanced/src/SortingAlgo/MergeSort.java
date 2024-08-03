package SortingAlgo;


class Merge{
	
	public  int[] merge(int[] arr,int s,int e,int mid){
		
		int n1 = mid-s+1;
		int n2 = e-mid;
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		int i,j,k;
		
		for( i = 0;i<n1;i++) {
		 left[i] = arr[i];	
		}
		
		for( i = 0;i<n2;i++) {
			 right[i] = arr[i];	
			}
		
		i = 0;
		j = 0;
		k = s;
		
		while(i<n1 && j<n2) {
			if(left[i] <= right[j]) 
			{
				arr[k++] = left[i++];
			}else {
				arr[k++] = right[j++];
			}
			
		}
		while(i<n1) {
			arr[k++]= left[i++];
		}
		while(i<n2) {
			arr[k++]= right[i++];
		}
		
		return arr;
	}
	
	
}

public class MergeSort {
	
	public static void main(String[] args) {
		
		Merge m = new Merge();
		int[] arr = {7,20,4,11,8,2};
		int n = arr.length;
		int s = 0;
		int e = arr.length-1;
		int mid = (s+e)/2;
		int[] ans = new int[n];
		 ans =  m.merge(arr,s,e,mid);
		 
		 for(int data :ans) {
			 System.out.print(data + " ");
		 }
		
	}

	

}
