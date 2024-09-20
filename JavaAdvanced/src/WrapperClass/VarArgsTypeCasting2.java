package WrapperClass;

class Demo5
{
	
	
//	public void m5(Long x) {  // Error bcz convert only int ==>Autoboxing ===> Integer
//		System.out.println("long");
//	}
	
 public void m5(Integer x) 
 {
	 System.out.println("Integer"); // first exe
 }
 
 public void m5(int...x)// m5(int[] x)
 {

	 System.out.println("var-args method");
 
 }
 
}
public class VarArgsTypeCasting2 {

	public static void main(String[] args) {
		
		Demo5 d5 = new Demo5();
		int x = 10;
		d5.m5(x);// int => Implicit type casting(Widening) ==> long,float,double
                 // int ==>Autoboxing ===> Integer
		         //        typecasting(Widening) ==> Number,Object
	}

}
