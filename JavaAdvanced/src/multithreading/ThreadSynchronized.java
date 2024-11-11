package multithreading;

class Display2
{
  public synchronized void wish(String name)
  {  
	  for(int i = 0;i<5;i++) {
		  
	  System.out.print("Good Evening : " );
	  try {
		    Thread.sleep(2000);
	  }catch(InterruptedException e) {
		  
	  }
	  System.out.println(name);
	  }
  }

}

class MyThread14 extends Thread
{
	  Display2 d;
	  String name;
	  MyThread14(Display2 d,String name)
	  {
		  this.d = d;
		  this.name = name;
		  
	  }
	  
	  @Override
	  public void run() {
		  d.wish(name);
	  }
}

public class ThreadSynchronized {

	public static void main(String[] args) {
		
		Display2 d1 = new Display2();
		Display2 d2 = new Display2();
		
		MyThread14 t1 = new MyThread14(d1,"sachin");
		MyThread14 t2 = new MyThread14(d2,"dhoni");
		
		t1.start();
		t2.start();

	}

}
