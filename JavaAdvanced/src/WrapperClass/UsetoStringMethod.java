package WrapperClass;

// String/primitive to Wrapper => valueOf()
// Wrapper type to primitive => xxxValue()
// String to primitive => parseXXX()
//primitive to String => toString(),toBinaryString(),toOctalString(),toHexString()


public class UsetoStringMethod {

	public static void main(String[] args) {
		
		// toString() => convert wrapper,primitive to String type
		
		String s1 = Integer.toString(100);
		String s2 = Boolean.toString(true);
		String s3 = Integer.toBinaryString(10);// 0,1
		String s4 = Integer.toHexString(100);// 0-9,a-f
		String s5 = Integer.toOctalString(100);// 0-7
		String s6 = Character.toString('a');
		String s7 = Integer.toString(7,2); // 111
		String s8 = Integer.toString(10,8);// 12
		String s9 = Integer.toString(10,16);// a
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);

	}

}
