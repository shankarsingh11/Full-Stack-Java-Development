package multithreading;

class ThreadC extends Thread
{
 	        int total = 0;
 	         
 			 @Override
 			 public void run()
 			 { 		       
 		    	  for(int i = 1;i<=1000;i++) {
 		    		   total += i;
 		    	  } 
 		    	  
 		    	  System.out.println("1 - lakh lines of code here");
 		    	  for(int i = 0;i<=10;i++) {
 		    		  System.out.println("hello world ");
 		    	  }
 		       
 			 }
 			 
}

public class ThreadSynchronizedSleep4 {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadC c = new ThreadC();
		
		 c.start();
		 
        // 2 thread main(5),child(5)
		// Thread.sleep(100);
		 System.out.println("No of threads active now : " + Thread.activeCount());
		 c.join();// main thread waiting for other thread to join
		 System.out.println("No of threads active now : " + Thread.activeCount());
		System.out.println(c.total);

	}

}
