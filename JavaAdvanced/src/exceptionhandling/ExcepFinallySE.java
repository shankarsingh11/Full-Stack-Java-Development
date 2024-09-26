package exceptionhandling;

class Demo1
{
  void disp()
  {
	  try {
	 System.out.println("method starting");
	 System.exit(0);
	  }
	  finally {
	 System.out.println("method ending");
	 }
  }
}

public class ExcepFinallySE {
    
	public static void main(String[] args) {
	
	Demo1 d1 = new Demo1();
	d1.disp();
    		 
	}

}
