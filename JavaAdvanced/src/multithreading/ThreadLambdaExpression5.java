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


public class ThreadLambdaExpression5 {

	public static void main(String[] args) {
		
		new Thread(() -> {
				for(int i = 0;i<5;i++) {
					System.out.println("child Thread ");
				}
		}).start();
         
         for(int i = 0;i<5;i++) {
        	 
         System.out.println("main thread ");
         
         }
         
	}

}
