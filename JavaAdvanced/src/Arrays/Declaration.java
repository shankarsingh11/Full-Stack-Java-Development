package Arrays;

public class Declaration {

	public static void main(String[] args) {
		int[]a;
		a = new  int[3];
		
		
		// All Valid Declaration 
		
		int a1[];
		int[]a2;
		int [] a3;
		int [][]a4;
		int[]a5[];
		int[][] a6;
		int a7[][];
		int []aaaa,bbbb[][];
		
		// valid 
		int [] x[],y; // Here -->  x====>2D Array , y====>1D Array
		int [][] xy,yz; // Here -->  xy====>2D Array , yz====>2D Array
		int [] []xz[],zx; //  Here -->  xz====>3D Array , zx====>2D Array
		int [][] yzz[],zy;//  Here -->  yz====>3D Array , zy====>2D Array
		
		// invalid 
		
		// int [4] ar; // we  are not given a size 
		//  inta [] ; // invalid becoz no space b/w datatype and varaible name  
		 // int []aaa,[]bbb; // CE 
		
	}

}
