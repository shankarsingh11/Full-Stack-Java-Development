package Arrays;

public class FindArrayClassType {

	public static void main(String[] args) {
		
		int [] a =new int [4];
		System.out.println(a.getClass().getName());
		
		int [][] ar =new int [3][4];
		System.out.println(ar.getClass().getName());
		
	}

}
