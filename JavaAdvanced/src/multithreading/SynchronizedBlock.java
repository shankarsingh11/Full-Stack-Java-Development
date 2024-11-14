package multithreading;

public class SynchronizedBlock {

	public static void main(String[] args) {
		
		Integer x = 30;
		
		// synchronized block (object )
		synchronized(x) {
			System.out.println(x);
		}

	}

}
