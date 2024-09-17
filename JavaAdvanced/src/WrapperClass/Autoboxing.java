package WrapperClass;

import java.util.ArrayList;

public class Autoboxing {

	public static void main(String[] args) {
		
		// Autoboxing
		Integer i3 = 30; // Behind => Integer i3 = Integer.valueOf(30);
		// eg1
		Boolean b1 = Boolean.valueOf(true);
		
		if(b1) 
			System.out.println("hello");
		
		//eg2
		 ArrayList al = new ArrayList();
		 
//		 Integer i1 = new Integer(10);
 //      Integer i2 = Integer.valueOf(20);		 
//		 al.add(i1);
//		 al.add(i2);
//		 System.out.println(al); // [10,20]
		 
		 al.add(10);
		 System.out.println(al);

	}

}
