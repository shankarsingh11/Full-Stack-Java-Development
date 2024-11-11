package multithreading;

class MyThread12 extends Thread
{
	@Override
  public void run()
  {
		 for(int i = 0;i<5;i++)
		  {
			  System.out.println("I am a lazy thread : " + i);
			 
		  }
		 
		 System.out.println("Entering into sleeping stage ");
	  try {
	 
		  Thread.sleep(2000);
	  
	} catch(InterruptedException e) 
	  {
		System.out.println("I gots interrupted ");
	  }
  }
  
}

public class ThreadInterrupted3 {

	public static void main(String[] args) {
		
		MyThread12 t = new MyThread12();
   
		 t.start();
		 t.interrupt();
		 
		 System.out.println("end of main thread : ");
		 
	}

}
