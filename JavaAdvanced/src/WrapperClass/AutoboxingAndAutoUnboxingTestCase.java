package WrapperClass;

public class AutoboxingAndAutoUnboxingTestCase {
    
	// final static Integer i1 = 10; // Autoboxing
	  static Integer i1 = 10; // Autoboxing
	public static void main(String[] args) {
		
		int i2 = i1; // AutoUnboxing
		m1(i2);// // Autoboxing

	}
	
	public static void m1(Integer i2) {
		int k = i2;// AutoUnboxing
		System.out.println(k);// 10
	}

}
