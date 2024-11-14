package multithreading;

class Display6
{
  public static synchronized void displayNumbers()
  {  
	  for(int i = 1;i<=10;i++) {
		  
	  System.out.print(i);
	  try {
		    Thread.sleep(2000);
	  }catch(InterruptedException e) {
		  
	  }
	 
     }
   }
	  
	  public  synchronized void displayCharacter()
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

class MyThread21 extends Thread
{
	 
       Display6 d;
	  MyThread21(Display6 d)
	  {
		  this.d = d;  
	  }
	  
	  @Override
	  public void run() {
		  d.displayNumbers();
		 
   } 

}
	  

class MyThread22 extends Thread
{
	 
       Display6 d;
	  MyThread22(Display6 d)
	  {
		  this.d = d;  
	  }
	  
	  @Override
	  public void run() {
		 d.displayCharacter();
	  }
}

public class ThreadSynchronized5 {

	public static void main(String[] args) {
		
		Display6 d1 = new Display6();
		
		
		MyThread21 t1 = new MyThread21(d1);
		MyThread22 t2 = new MyThread22(d1);
		
		t1.start();
		t2.start();

	}

}
