package multithreading;



class MyThread4 extends Thread
{
	@Override
	public void start()
	{   
		// Thread a created 
		super.start();
		System.out.println("start method called");
	}
	@Override
   public void run()
   {
	   System.out.println("No args run method ");
   }
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		
		MyThread4 t3 = new MyThread4();
		
	// Since our class start() called , no new thread created 	
		t3.start();
           
		System.out.println("Main method ");
	}

}

//OutPut 
//2 Thread ==> main thread ==> start method called,main method 
//userdefine thread ==>no args run method 
