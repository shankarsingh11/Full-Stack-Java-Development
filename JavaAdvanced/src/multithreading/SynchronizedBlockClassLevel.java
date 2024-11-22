package multithreading;

class Display8
{
   public void wish(String name)
   {  
	   ;;;;;;;;;//1-lakh lines of code
	   
	  // lock of class level,so only thread can access this region as it is critical
	   
	     synchronized(Display8.class) {
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
	     
	     ;;;;;;;;;// 1-lakh lines of code 
   }
}


class MyThread24 extends Thread
{
	Display8 d;
	String name;
	
	MyThread24(Display8 d,String name){
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}

}
public class SynchronizedBlockClassLevel {

	public static void main(String[] args) {
		
		Display8 d1 = new Display8();
		Display8 d2 = new Display8();
		
		MyThread24 t1 = new MyThread24(d1,"shankar");
		MyThread24 t2 = new MyThread24(d2,"shubham");
		
		t1.setName("shankar thread");
		t2.setName("shubham thread");
		t1.start();
		t2.start();
		
	}

}
