package OOPs.inner;


abstract class Computer
{
	public abstract void show();
}

class Laptop extends Computer
{  
	// overriding method 
	public void show() 
	{
     System.out.println("Laptop");		
		
	}
	
	public void disp()
	{
		System.out.println("laptop display");
	}
   
	
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		Computer c1 = new Computer() 
		// anonymous inner class
		 {	
			public void show()
			{
				System.out.println("computer");
			}
			
		};
		
		c1.show();
		
		Computer c2 = new Laptop()
		// anonymous inner class
				{

					public void show() {
						
						System.out.println("something new ");
					}
					
					public void disp() {
						System.out.println("something new display");
					}
			       
				};
				
				c2.show();
				
				
		Laptop l2 = new Laptop()
			// anonymous inner class
			{

				public void show() {
										
				System.out.println("something new ");
			}
									
		      public void disp() 
		    {
				System.out.println("something new display");
			}
							       
		};
								
		l2.show();
		l2.disp();
				
				//c3 call a method if exist in class computer
				Computer c3 = new Laptop();
				c3.show();
				
				Laptop l = new Laptop();
				l.disp();
				l.show();
				
	}

}
