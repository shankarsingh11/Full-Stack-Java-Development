package multithreading;

class ThreadE extends Thread
{
 	       int total = 0; 
 			 @Override
 			 public void run()
 			 {
 		       synchronized(this){
 		    	   System.out.println("child thread is starting a caclculation :"); // step - 2
 		    	  for(int i = 1;i<=10;i++) {
 		    		   total += i;
 		    	  }  
 		    	  
 		    	  try {
 		    		  Thread.sleep(3000);
 		    	  }catch(Exception e) {}
 		    	  
 		    	  System.out.println("child thread is giving a notification : ");// step - 3
 		    	  this.notify();
 		       }
 		       
 			 }
}
public class ThreadSynchronizedNotifyWait5 {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadE e = new ThreadE();
		
		 e.start();
	        // 2 thread main(5),child(5)
			Thread.sleep(2000);
		 synchronized(e) {
			 System.out.println("main thread calling wait() method : ");// step -1 
			 e.wait();
			 System.out.println("main thread got notification call:");// step - 4
			 System.out.println(e.total);
		 }

	}

}
