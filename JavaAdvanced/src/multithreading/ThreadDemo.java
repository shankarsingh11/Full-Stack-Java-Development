package multithreading;



class MyThread3 extends Thread
{
	@Override
	public void start()
	{   
		
		System.out.println("start method called");
	}
	@Override
   public void run()
   {
	   System.out.println("No args run method ");
   }
}

public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread3 t3 = new MyThread3();
		
	// Since our class start() called , no new thread created 	
		t3.start();

	}

}
