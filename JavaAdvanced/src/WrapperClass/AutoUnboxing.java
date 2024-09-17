package WrapperClass;

public class AutoUnboxing {

	public static void main(String[] args) {
		
		// AutoUnboxing
		// eg1
		Integer i1 = Integer.valueOf(10);
		Integer i6 = Integer.valueOf("100");
		int i2 = i1;
		System.out.println(i2); // int i2 = i1.intValue(); // 10
		System.out.println(i6); // 100
		// eg2
		
		
		//  Integer i5 = "20"; // Error => incomputable Type
		
		Integer i3 = new Integer("20");
		int i4 = i3;
		System.out.println(i4); // 20

	}

}
