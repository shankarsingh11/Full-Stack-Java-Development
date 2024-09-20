package WrapperClass;

//JDK1.0 +> Method Overloading => CompileTimePolymorphism
//JDK1.4v => change in the no of arguments new method should be written.
// JDK1.5v => Singlemethod can handle any no of  arguments (All should be of same type)

class Demo
{             //jdk1.5v called var-args-approach(ellipse)
	
  public void 	add1(int... x) 
  {
	  System.out.println("var-args-approach");
  }
  
  public void 	add2(int ...x) 
  {
	System.out.println(x);
  }
  
  public void 	add3(int...x) 
  {
	  int total = 0;
	for(int ele:x)
	{   
		total += ele;
		System.out.println(ele);
		
	}
	System.out.println("Sum is : " + total);
	System.out.println();
  }
  
}

public class VarArgsApproach {
	
	public static void main(String[] args) {
		
		// int[] arr = new int[]{10,30}; // correct 1D 
		
		Demo d = new Demo();
		
		System.out.println("Add1 Output : ");
		// add1
		d.add1();
		d.add1(10);
		d.add1(10,20);
		d.add1(10,20,30);
		d.add1(10,20,30,40);
		d.add1((int)10.23); 
		System.out.println();
    //	d.add1((long)19.82); // Unresolved compilation problem
		
		// add2
		System.out.println("Add2 Output:");
		d.add2();
		d.add2(10);
		d.add2(10,20);
		d.add2(10,20,30);
		d.add2(10,20,30,40);
		d.add2((int)10.23); 
		System.out.println();
		
		// add3
		System.out.println("Add3 Output:");
		d.add3();
		d.add3(10);
		d.add3(10,20);
		d.add3(10,20,30);
		d.add3(10,20,30,40);
		d.add3((int)50.23); 
		
	}

}
