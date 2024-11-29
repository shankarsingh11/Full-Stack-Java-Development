package OOPs.interfaceconcepts;

interface ISample
{   
	// 100% abstract class
	// method by default "abstract and public "
	void m1();
	void m2();
	
	// Given Compile time error ==> fix => using default , static , remove body
	// void m3() {}
}


/*
// if no any abstract method  then class not make a abstract
  class SampleImpl implements ISample 
{
	 @Override //indication to  compiler that these methods are override method 
	public void m1()
	{
		System.out.println("hey implementation given for m1()");
	}

	@Override
	public void m2() {
		System.out.println("hey implementation given for m2()");
		
	}
	
}
  
*/


//if any abstract method exist then class make a abstract
 abstract class SampleImpl implements ISample 
{
	 @Override //indication to  compiler that these methods are override method 
	public void m1()
	{
		System.out.println("hey implementation given for m1()");
	}

    public abstract void m2();
	
}


 class SubSampleImpl extends SampleImpl
 {
	@Override //indication to  compiler that these methods are override method 
	public  void m2() {
		System.out.println("hey implementation given for m2()");
	}
	 
 }
 

public class TestApp {

	public static void main(String[] args) {
		
		
		
		// SampleImpl class is not abstract class then 
		//ISample sample = new  SampleImpl();// loose coupling
		
		// Not good Approach
		SampleImpl sample1 = new SubSampleImpl();
		sample1.m1();
		sample1.m2();
		
		//SampleImpl class is abstract class then SubSampleImpl class extends a SampleImpl class and implement a method 
		ISample sample2 = new SubSampleImpl(); // good approach 
		sample2.m1();
		sample2.m2();
		
		

	}

}
