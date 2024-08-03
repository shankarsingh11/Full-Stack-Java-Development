package Arrays;

public class MaxMin {

	public static void main(String[] args) {
		
		int [] a = {20,30,25,60,15};
		
		int max = a[0];
		
		for(int i = 0 ;i<a.length ; i++) {
         if(a[i] > max) {
        	 max = a[i];
        	 }
         }
		
		System.out.println("Maximum element in array is : " + max);

		
		int min = a[0];
		
		for(int i = 0 ;i<a.length ; i++) {
	         if(a[i]<max) {
	        	 min = a[i];
	        	 }
	         }
			
			System.out.println("Minimum element in array is : " + min);

	}

}
