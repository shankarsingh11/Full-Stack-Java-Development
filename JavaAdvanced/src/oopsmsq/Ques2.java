package oopsmsq;

public class Ques2 {
	
	private static int[] arr; // arr = null

	public static void main(String[] args) {
		
          if(arr.length>0 && arr != null) { // NullPointerException
        	  System.out.println(arr[0]);
          }
	}

}
