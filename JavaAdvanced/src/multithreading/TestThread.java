package multithreading;

/*
class Thread 
{
// Heart of MultiThreading
  
   public void start()
   {
     1. Register the thread with ThreadScheduler
     2.All other mandatory to low level Activities(Memory level)
     3.invoke or call run() method    
   }
   
   public void run()
   {
    //  no implementation
   }
}
*/

class MyThread extends Thread
{
	// task for userdefine thread
     @Override
     public void run() 
  {	 
	for(int i = 0;i<10;i++)
	{
		System.out.println("child Thread");
	}
 }
     
}

public class TestThread {

	public static void main(String[] args) {
		
		MyThread t = new MyThread();// thread instantiation
		//t.run(); // it work as main thread (normal execution)
		
 // this line will create a new thread which is responsible for execute to run()	
	    t.start();// starting a thread 
		
		
//2 thread started and eagerly waiting for cpu time,scheduling done by ThreadScheduler(T.S)	
		 
		 // task for main thread
		for(int i = 0;i<10;i++)
		{
           System.out.println("main Thread");
		}

	}

}
