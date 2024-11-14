package multithreading;

class Display3
{
  public  void displayNumbers()
  {  
	  for(int i = 1;i<=10;i++) {
		  
	  System.out.print(i);
	  try {
		    Thread.sleep(2000);
	  }catch(InterruptedException e) {
		  
	  }
	 
     }
   }
	  
	  public  void displayCharacter()
	  {
		   for(int i = 65;i<75;i++) {
			   System.out.print((char)i);
			   try {
				   Thread.sleep(2000);
			   }catch (InterruptedException e) {
				   
			   }
		   }
	  }

}

class MyThread15 extends Thread
{
	 
       Display3 d;
	  MyThread15(Display3 d)
	  {
		  this.d = d;  
	  }
	  
	  @Override
	  public void run() {
		  d.displayNumbers();
		 
   } 

}
	  

class MyThread16 extends Thread
{
	 
       Display3 d;
	  MyThread16(Display3 d)
	  {
		  this.d = d;  
	  }
	  
	  @Override
	  public void run() {
		 d.displayCharacter();
	  }
}

public class ThreadSynchronized2 {

	public static void main(String[] args) {
		
		Display3 d1 = new Display3();
		
		
		MyThread15 t1 = new MyThread15(d1);
		MyThread16 t2 = new MyThread16(d1);
		
		t1.start();
		t2.start();

	}

}
