package multithreading;

class MyThread9 extends Thread 
{ 	
  static Thread mt;
  @Override
  public void run()
  {		
	  try {
		  
		  mt.join(); // child thread is waiting for main thread 
		  
	} catch (InterruptedException e) {
		
		 e.printStackTrace();
	}
	  
	  for(int i = 0;i<5;i++)
	  {
		  System.out.println("child thread ");
	  }
	
  }
  
}

public class TestSleepMethod2 {
	
	public static void main(String[] args) throws InterruptedException {
	    
		MyThread9.mt = Thread.currentThread();
		
		MyThread9 t = new MyThread9();
		t.start();
	    Thread.sleep(2000);	
	    
		for(int i = 0;i<=5;i++)
		{
			System.out.println("rama thread ");
		}
		
	}
	
}
