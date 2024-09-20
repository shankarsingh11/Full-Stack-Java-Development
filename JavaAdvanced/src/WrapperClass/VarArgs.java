package WrapperClass;

class Demo1
{
   public void m1(String x,int... y)
   {
	   
	  for(int ele:y)
	  {
		  System.out.println(ele); 
		 
	  }
	  
	  System.out.println(x);
   }
   
}

class Demo2
{
   public void m2(int...  x) // m2(int[] x)
   {
	 System.out.println("var-args method ");   
   }
   
   public void m2(int x)// m2(int x)
   {
	  System.out.println("int method");   
   }
   
}
public class VarArgs {

	public static void main(String[] args) {
	
		Demo1 d1 = new Demo1();
		
		// m1
		System.out.println();
		
		d1.m1("shankar");
		d1.m1("amit", 10);
		d1.m1("nitin", 10,20);
		d1.m1("deepak",10,30,40);
		
		Demo2 d2 = new Demo2();
		// m2
		
		d2.m2(); // new int[]
		d2.m2(10,0);// int x
		d2.m2(10,20);// new int[]{10,20}
		d2.m2(30,20,40);// new int[]{30,20,40}
		d2.m2((new int[] {12,23,34,45}));
		d2.m2(10);// int x
		
		

	}

}
