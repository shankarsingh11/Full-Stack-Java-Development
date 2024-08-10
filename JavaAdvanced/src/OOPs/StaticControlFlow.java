package OOPs;

public class StaticControlFlow {
	
	static int a;
	static int b;
	
	
	// first call before main method 
	static {
		System.out.println("Static Block");
		a =10;
		b=20;
	}
	  // third call after main method 
	static void disp() {
		
		System.out.println("Static Method");
		System.out.println(a);
		System.out.println(b);
	}
        // second call before static or non static method 
	public static void main(String[] args) {
		
		System.out.println("Main Method ");
		disp();  // calling without className because method exist in same class other class static method calling using className

	}

}
