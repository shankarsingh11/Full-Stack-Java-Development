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


public class ThreadLambdaExpression2 {

	public static void main(String[] args) {
			 
		Thread t = new Thread(new Runnable() {		
			@Override
			public void run() {
				for(int i =0;i<5;i++) {
					System.out.println("child thread ");
				}
			}
			
		}
		
	 );				
         t.start();
         
         for(int i = 0;i<5;i++) {      	 
         System.out.println(" main thread ");  
         }         
	}
}
