package multithreading;

class MyThread11 extends Thread
{
	@Override
  public void run()
  {
		
		 
	  try {
		  
		  for(int i = 0;i<5;i++)
		  {
			  System.out.println("I am a sleeping thread : " + i);
			  
		  }	  
	  
	} catch(Exception e) 
	  {
		System.out.println("I gots interrupted ");
	  }
  }
  
}

public class ThreadInterrupted2 {

	public static void main(String[] args) {
		
		MyThread11 t = new MyThread11();
   
		 t.start();
		 t.interrupt();
		 
		 System.out.println("end of main thread : ");
		 
	}

}
