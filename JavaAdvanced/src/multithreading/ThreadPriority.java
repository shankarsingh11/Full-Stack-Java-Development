package multithreading;

class MyThread6 extends Thread
{   
	@Override
   public void run()
   {
		Thread.yield();
	   System.out.println("Priority of child thread :: " + Thread.currentThread().getPriority());
	   
	   for(int i = 1;i<=5;i++)
	   {
		   System.out.println("child thread");
	   }
   }
}
public class ThreadPriority {

	public static void main(String[] args) {
		
		MyThread6 t = new MyThread6();
		//t.setPriority(10);
	    t.start();
	    System.out.println("priority of main thread :: " + Thread.currentThread().getPriority());
	   

	}

}
