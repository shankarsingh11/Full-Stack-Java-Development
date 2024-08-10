package OOPs;

public class NonStaticBlock {
	
	int a;
	int b;
	
	//int count;  // New Memory space created for every function call and in every function call initialize with 0
	
	static int count;  // class variable,  Same  Memory using by all call function
	
	int demo() {
		System.out.println("Non static method ");
	 count++;
	 return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("Main method call ");
		NonStaticBlock s1 = new NonStaticBlock();
		NonStaticBlock s2 = new NonStaticBlock();
		NonStaticBlock s3 = new NonStaticBlock();
		
		// when count is non static variable 
	//	System.out.println(s1.demo());//1
	//  System.out.println(s2.demo());//1
	//	System.out.println(s3.demo());//1
		
		// when count is static variable 
		System.out.println(s1.demo());//1
		System.out.println(s2.demo());//1
		System.out.println(s3.demo());//1
		
		System.out.println("Static variable exist in same classs so access without class name ");
		System.out.println(count);// access without classname 
		
		
	}

}
