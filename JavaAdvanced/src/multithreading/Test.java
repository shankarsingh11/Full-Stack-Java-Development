package multithreading;

class MyRunnable1 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("run method ");
	}

}

public class Test {

	public static void main(String[] args) {
		
	MyRunnable1 r = new MyRunnable1();
	
	Thread t = new Thread(r);
	
	t.start();
	
	System.out.println("main method");
		

	}

}
