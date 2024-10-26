package multithreading;


class MyRunnable2 implements Runnable
{
   @Override
   public void run()
   {   
	  String name =  Thread.currentThread().getName();
	  System.out.println("run() is executed by :: "+ name);
	
   }
}

public class CreateThreadOwnName {
	
	public static void main(String[] args) {
		
		MyRunnable2 r = new MyRunnable2();
		//Thread t = new Thread();
		Thread t = new Thread(r);
		 t.start();	
    String name = Thread.currentThread().getName();
    System.out.println("main() is executed by :: " + name);
    
   
	}

}
