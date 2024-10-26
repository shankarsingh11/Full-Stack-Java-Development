package multithreading;


class MyRunnable3 implements Runnable
{
   @Override
   public void run()
   {   
	 // Thread.currentThread().setName("vishnu");
	  Thread.currentThread().setName("shankar");
	   System.out.println("run() is executed by :: " + Thread.currentThread().getName());
	   
	   int[] a = new int[5];
	   
	   for(int i = 0;i<=5;i++) {
		   
		   System.out.println(a[i]);
	   }
	   
   }
}

public class CreateThreadOwnName2 {
	
	public static void main(String[] args) {
		
		MyRunnable3 r = new MyRunnable3();
		//Thread t = new Thread();
		Thread t = new Thread(r);
		
		 t.start();
		 
    Thread.currentThread().setName("shankar");
    System.out.println("main is executed by :: " + Thread.currentThread().getName());
    System.out.println(10/0);
    
	}

}
