package Arrays;

public class PrintMDArrayUsingForEachLoop {

	public static void main(String[] args) {
		
		// Jagged Multidimensional Array 
		
		//  Jagged 2D Array
		
    int [][] ar = {{10,20},{30,40,50},{90,60,70,30,24}};
    
    System.out.println(" Print 2D Jagged  Array Elements : ");
    
    for( int [] a : ar) {
    	
    	for(int elem : a) {
    		
    		System.out.print(elem + " ");
    		
    	}
    	
    	System.out.println();
    }
    
    // Jagged 3D Array 
	
    System.out.println("Print 3D Jagged Array Element : ");
    
    int [][][] ar2 = {{{20,30},{40,66}},{{70,89},{75,70,66}}};
    
    // Print Using For Each loop 
    
    for( int [][] a : ar2) {
    	
    	for(int [] elem : a) {
    		
    		for(int data : elem) {
    			System.out.print(data + " ");
    		}
    		
    		System.out.println();
    	}    	
    	System.out.println();
    }
   
  }

}
