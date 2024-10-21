package multithreading;

/*
 * interface Runnable
 * {
 *   public abstract void run();
 * }
 * 
class Thread implements Runnable
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

class MyRunnable implements Runnable
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

public class TestRunnable {

	public static void main(String[] args) {
		
     		  MyRunnable r = new MyRunnable();
     			
     		  Thread t = new Thread(r);
     		  
     		    t.start();// starting a thread 
     		  
           // 2 Thread , main thread and userdefined thread		
		 
		 // task for main thread
		for(int i = 0;i<10;i++)
		{
           System.out.println("main Thread");
		}

	}

}
