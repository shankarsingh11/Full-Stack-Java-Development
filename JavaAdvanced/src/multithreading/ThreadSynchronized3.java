package multithreading;

class Display4
{
  public synchronized void displayNumbers()
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

class MyThread17 extends Thread
{
	 
       Display4 d;
	  MyThread17(Display4 d)
	  {
		  this.d = d;  
	  }
	  
	  @Override
	  public void run() {
		  d.displayNumbers();
		 
   } 

}
	  

class MyThread18 extends Thread
{
	 
       Display4 d;
	  MyThread18(Display4 d)
	  {
		  this.d = d;  
	  }
	  
	  @Override
	  public void run() {
		 d.displayCharacter();
	  }
}

public class ThreadSynchronized3 {

	public static void main(String[] args) {
		
		Display4 d1 = new Display4();
		
		
		MyThread17 t1 = new MyThread17(d1);
		MyThread18 t2 = new MyThread18(d1);
		
		t1.start();
		t2.start();

	}

}
