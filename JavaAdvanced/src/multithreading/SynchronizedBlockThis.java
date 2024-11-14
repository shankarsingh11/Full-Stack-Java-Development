package multithreading;

class Display7
{
   public void wish(String name)
   {  
	     synchronized(this) {
	    	 System.out.println("Thread which is getting a lock is : " + Thread.currentThread().getName());
	    	 for(int i = 1;i<=5;i++) {
	    		 System.out.print("Good morning : ");
	    		 try {
	    			 Thread.sleep(2000);
	    		 }catch(InterruptedException e) {
	    			 
	    		 }
	    		 
	    		 System.out.println(name);
	    	 }
	     }
	     
	     System.out.println("Thread which is releasing a lock is : " + Thread.currentThread().getName());
   }
}


class MyThread23 extends Thread
{
	Display7 d;
	String name;
	
	MyThread23(Display7 d,String name){
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}

}
public class SynchronizedBlockThis {

	public static void main(String[] args) {
		
		Display7 d1 = new Display7();
		Display7 d2 = new Display7();
		
		MyThread23 t1 = new MyThread23(d1,"shankar");
		MyThread23 t2 = new MyThread23(d2,"shubham");
		
		t1.setName("shankar thread");
		t2.setName("shubham thread");
		t1.start();
		t2.start();
		
	}

}
