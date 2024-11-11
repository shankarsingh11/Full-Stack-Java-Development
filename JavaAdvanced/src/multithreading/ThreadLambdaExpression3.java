package multithreading;


/*
interface Runnable
{
  void run();	
}

*/

/*
class MyRunnable4 implements Runnable
{
	public  void run()
	{  
		for(int i  = 0;i<5;i++) {
		System.out.println("child thread ");
		}
	}
	
}

*/


public class ThreadLambdaExpression3 {

	public static void main(String[] args) {
	
		MyRunnable r = new MyRunnable(){
			
			@Override
			public void run() {
				
			for(int i = 0;i<5;i++)
			{
				System.out.println("child Thread ");
			} 
			
		   }
			
	     };
		 
		Thread t = new Thread(r);
         t.start();
         
         for(int i = 0;i<5;i++) {
        	 
         System.out.println(" main thread ");
         
         }
         
	}

}
