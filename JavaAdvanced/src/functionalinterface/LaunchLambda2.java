package functionalinterface;

@FunctionalInterface
interface LambdaDemo1
{
  void add(int a,int b);	
}
@FunctionalInterface
interface LambdaDemo2
{
   int sub(int a,int b);	
}

@FunctionalInterface
interface LambdaDemo3
{
   int mult(int a);	
}


// All About Lambda Expression

// to write lambda exp to use lambda operator ()->{}; or ()-> single statement;
// lambda operator divided into 2 parts to write lambda exp
// left side of lambda operator we write parameters required
// right side of lambda operator we write a body or implementation
// left side of parameters for datatype is optional
// right side if implementation or body has a one statement the {} is optional
//left side if parameter is single then () and data of type both optional
//right side in body if its single line implementation then return statement is also optional
// {} is mandatory if there are more than then one statement and 
// also if there is return statement explicitly used by developer
 
public class LaunchLambda2 {

	public static void main(String[] args) {
		
		// if single parameter  passed then paranthesis not needed and return type in lambda exp
		LambdaDemo3 ld3 = num->num*2;
		
		LambdaDemo1 ld1 = (a,b)->{
			 System.out.println(a+b); // 30
		};
		
		
		LambdaDemo2 ld2 = (int a,int b)->{
			return a-b;
		};
		
		
	
    ld1.add(10, 20);
    System.out.println(ld2.sub(30, 10));// 20
   System.out.println( ld3.mult(5));// 10	
	}

}
