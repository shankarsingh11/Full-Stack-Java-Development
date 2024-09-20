package WrapperClass;

class Demo7
{
  public void m7(Object o)
  {
	  System.out.println("Object");
  }
  
  public void m7(Number n) {
	  System.out.println("NUmber");
  }
  
  
}


class Demo6
{
	
	
    public void m6(Integer x)// second priority  // AutoBoxing
    {
    	System.out.println("Integer");
    	
    }
    
    public void m6(float x) // first priority // widening
    {
    	System.out.println("float");
    }
}

public class AutoBoxingAndWideningTest {

	public static void main(String[] args) {
		
		System.out.println("Demo6: ");
		Demo6 d6 = new Demo6();
		
		int x = 10;  // int ==> Widening==>long,float,double
		              //        AutoBoxing==>Long
		
		d6.m6(x);  // int ==>AutoBoxing==>Integer
                  //         Widening==> Number,Object
		System.out.println("Demo7: ");
		
		Demo7 d7 = new Demo7();
		int y = 10;
		d7.m7(y);          // AutoBoxing==>Integer //first
                         // Widening==> Number,Object//second
		
	}

}
