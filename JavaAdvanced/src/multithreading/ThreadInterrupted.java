package multithreading;

class MyThread10 extends Thread
{
	@Override
  public void run()
  {
	  try {
	  for(int i = 0;i<5;i++)
	  {
		  System.out.println("I am a sleeping thread : " + i);
		  Thread.sleep(2000);  
	  }
	  
	} catch(InterruptedException e) // Exception e
	  {
		System.out.println("I got interrupted ");
	  }
  }
  
}

public class ThreadInterrupted {

	public static void main(String[] args) {
		
		MyThread10 t = new MyThread10();
   
		 t.start();
		 t.interrupt();
		 
		 System.out.println("end of main thread : ");
		 
	}

}
