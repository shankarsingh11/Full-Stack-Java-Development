package ArrayProblem;

public class TargetKey {

	public static void main(String[] args) {
		
		// Linear Search Algorithm
		
		int[] arr = {20,30,10,40,90,60,80};
		int key = 40;
		boolean flag = false;
		
		for(int i = 0; i<arr.length;i++) {
			if(key == arr[i]) {
				System.out.println("key " + key + " found in index " + i);
				flag = true;
				break;
			}
			
		}
		
		if(flag == false) {
			System.out.println("Key is not found ");
		}
		

	}

}
