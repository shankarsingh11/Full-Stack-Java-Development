package functionalinterface;

@FunctionalInterface
interface Demo // only one method declare inside the interface
{   
  	void disp();
  	
}


class Trail implements Demo
{
  public void disp()
  {
	 System.out.println("Interfce implementation"); 
  }
}



public class Launch1 {
	
	public static void main(String[] args) {
		
		Trail t = new Trail();
		t.disp();
     
	    Demo d =()->System.out.println("first syntax Lambda Expression");
		
		Demo d1= ()->
		{
			System.out.println("Second syntax Lambda expression");
		};
		
		d.disp();
		d1.disp();
	 	 
	}

}
