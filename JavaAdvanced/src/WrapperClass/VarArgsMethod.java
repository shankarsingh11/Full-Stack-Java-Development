package WrapperClass;

class Demo3

{
	
  public void m1(int...x)
  {
	   System.out.println("var-args method");
  }
  
//   public void m1(int[] x)  // Error
//   {
// 	   System.out.println("int[] method");
//  }
  
  public void m2(int[]...x) // m2(int[][] x) default statement in switch
  {
	  System.out.println(x);// [[@
	  
	  for(int[] a:x)
	  {
		  System.out.println(a);//[@
		  for(int ele:a)
		  {
			  System.out.println(ele);
		  }
		  System.out.println();
	  }
	  
  }
  
}

public class VarArgsMethod {

	public static void main(String[] args) {
		
	Demo3 d3 = new Demo3();
	
//	d3.m1();
//	d3.m1(10,20);
//	d3.m1((new int[] {10,20,30}));
	System.out.println();
	
	System.out.println("m2 : ");
	int[] x = {10,20,30};
	int[] y = {40,50};
	d3.m2(x,y);
	System.out.println();
	d3.m2(y,x);
	
	 
	}

}
