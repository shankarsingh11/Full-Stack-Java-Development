package ArrayProblem;

public class PrintMatrix {

	public static void main(String[] args) {
		
		int [][] matrix2 = new int[3][3];
		
		int[][] matrix  = {{2,4,6},{3,8,9},{10,5,7}};
		
		int col = matrix[2].length;
		int row = matrix[2].length;
	
		System.out.println("Print a matrix : ");
		System.out.println("No of Row in matrix A : " + row);
		System.out.println("No of Col in Matrix A : " + col);
		System.out.println("Total no of Elements in MAtrix :  " + row * col);
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++) 
			{
				System.out.print(matrix[i][j] + " ");
			}
			
			System.out.println();
		}
		

	}

}
