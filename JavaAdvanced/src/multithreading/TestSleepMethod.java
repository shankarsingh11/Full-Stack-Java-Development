package multithreading;

class MyThread8 extends Thread 
{  
	@Override
  public void run()
  {
		System.out.println("sita thread "); 
		
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		 e.printStackTrace();
	}
	
  }
  
}

public class TestSleepMethod {
	
	public static void main(String[] args) throws InterruptedException {
	
		MyThread8 t = new MyThread8();
		t.start();
		t.join(1000);
		
		for(int i = 0;i<=5;i++)
		{
			System.out.println("rama thread ");
		}
		
	}

}
