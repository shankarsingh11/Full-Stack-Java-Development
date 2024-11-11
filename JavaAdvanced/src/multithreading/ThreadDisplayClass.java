package multithreading;

class Display
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

class MyThread13 extends Thread
{
	  Display d;
	  String name;
	  MyThread13(Display d,String name)
	  {
		  this.d = d;
		  this.name = name;
		  
	  }
	  
	  @Override
	  public void run() {
		  d.wish(name);
	  }
}

public class ThreadDisplayClass {

	public static void main(String[] args) {
		
		Display d = new Display();
		MyThread13 t1 = new MyThread13(d,"sachin");
		MyThread13 t2 = new MyThread13(d,"dhoni");
		
		t1.start();
		t2.start();

	}

}
