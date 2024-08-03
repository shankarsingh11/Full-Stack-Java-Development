package RecProblem;

import java.util.*;

class  Multiplication{
	 // Any type of value multiply like +ve,-ve 
	 
	 int mul2(int a ,int b) {
		 
		 if(a == 0) return 0;
		 
		 if(a<0) {
			 return mul2(a+1,b) -b;
		 }
		 
		 return mul2(a-1,b) + b;
		 
	 }
	 
float  mul3(float m ,float n) {
		 
		 if(m == 0) return 0;
		 
		 if(m<0) {
			 return mul3(m+1,n) -n;
		 }
		 
		 return mul3(m-1,n) + n;
		 
	 }

 float mul4(float a ,int b) {
	 
	 if(a == 0) return 0;
	 
	 if(a<0) {
		 return mul4(a+1,b) -b;
	 }
	 
	 return mul4(a-1,b) + b;
	 
}
 double  mul5(double  a ,double b) {
	 
	 if(a == 0) return 0;
	 
	 if(a<0) {
		 return mul5(a+1,b) -b;
	 }
	 
	 return mul5(a-1,b) + b;
	 
}
 
	 
	 
 
double  mul5(double  a ,float b) {
	 
	 if(a == 0) return 0;
	 
	 if(a<0) {
		 return mul5(a+1,b) -b;
	 }
	 
	 return mul5(a-1,b) + b;
	 
}
 
	 
}
public class Multiply {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number ");
		int a = in.nextInt();
		int b = in.nextInt();
		
		float m = in.nextFloat();
		float n = in.nextFloat();
		
		double p = in.nextDouble();
		double q = in.nextDouble();
		Multiplication pro = new Multiplication();
		
	     // System.out.println(m.mul1(a,b));
	      System.out.println(pro.mul3(m,n));
	}

}
