package multithreading;


class MyThread2 extends Thread
{
	
  public void run()
  {
	  System.out.println("no args run method ");
	  run(5);
  }
  
  public void run(int n)
  {
	  
	  System.out.println("int args run method ");
  }
  
}

public class ThreadTest {

	public static void main(String[] args) {
		
      MyThread2 t2 = new MyThread2();
    // creating a new thread and starting a new thread which call run()  
      t2.start();
     
      // explicitly make a call
      t2.run(5);
      
      // task for main thread
      for(int i = 0;i<10;i++)
      {
    	  System.out.println("main method ");
      }
      
	}

}
