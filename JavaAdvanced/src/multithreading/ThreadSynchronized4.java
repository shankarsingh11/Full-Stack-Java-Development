package multithreading;

class Display5
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
	  
	  public static synchronized void displayCharacter()
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

class MyThread19 extends Thread
{
	 
       Display5 d;
	  MyThread19(Display5 d)
	  {
		  this.d = d;  
	  }
	  
	  @Override
	  public void run() {
		  d.displayNumbers();
		 
   } 

}
	  

class MyThread20 extends Thread
{
	 
       Display5 d;
	  MyThread20(Display5 d)
	  {
		  this.d = d;  
	  }
	  
	  @Override
	  public void run() {
		 d.displayCharacter();
	  }
}

public class ThreadSynchronized4 {

	public static void main(String[] args) {
		
		Display5 d1 = new Display5();
		
		
		MyThread19 t1 = new MyThread19(d1);
		MyThread20 t2 = new MyThread20(d1);
		
		t1.start();
		t2.start();

	}

}
