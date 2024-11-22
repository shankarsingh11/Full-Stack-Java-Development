package multithreading;

class ThreadD extends Thread
{
 	       int total = 0;
 	         
 			 @Override
 			 public void run()
 			 {
 		       synchronized(this) {
 		    	   System.out.println("child thread is starting a caclculation :"); // step - 2
 		    	  for(int i = 1;i<=10;i++) {
 		    		   total += i;
 		    	  }  
 		    	  
 		    	  System.out.println("child thread is giving a notification : ");// step - 3
 		    	  this.notify();
 		       }
 		       
 			 }
}
public class ThreadSynchronizedNotifyWait4 {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadD d = new ThreadD();
		
		 d.start();
	// 2 thread main(5),child(5)
		
		 // main thread is sleeping 
		 Thread.sleep(3000);
		 
		 
		 synchronized(d) {
			 System.out.println("main thread calling wait() method : ");// step -1 
			 d.wait();// infinite wait
			 System.out.println("main thread got notification call:");// step - 4
			 System.out.println(d.total);
		 }

	}

}
