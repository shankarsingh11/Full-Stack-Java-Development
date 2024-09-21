package functionalinterface;


// @FunctionalInterface
interface Demo1
{
  void disp();
  void add(int a,int b);
}

public class Launch2 {

	public static void main(String[] args) {
		
   Demo1 d1= new Demo1() 
   {
	    public void disp() {
	    	System.out.println("Annonynous class");
	    }
	    
	    public void add(int a,int b) {
	    	int c = a + b;
	    	System.out.println(c);
	    }
   };
   
   d1.disp();
   d1.add(10, 20);
	}

}
