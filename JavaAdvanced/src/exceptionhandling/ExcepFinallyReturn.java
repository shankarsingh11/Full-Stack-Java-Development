package exceptionhandling;

class Demo
{
  int disp()
  {
	  try {
	 System.out.println("method starting");
	 return 10;
	  }
	  finally {
	 System.out.println("method ending");
	 }
  }
}

public class ExcepFinallyReturn {
    
	public static void main(String[] args) {
	
	Demo d = new Demo();
	d.disp();
    		 
	}

}
