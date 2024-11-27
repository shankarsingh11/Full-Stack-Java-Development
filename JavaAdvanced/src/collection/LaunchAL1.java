package collection;
// To use any of the collection classes we need to import
import java.util.*;

public class LaunchAL1 {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		
		// homogeneous type of data is allowed
		System.out.println(al1);
		System.out.println("***********************");
		
		ArrayList al2 = new ArrayList();
		
		al2.add("ineuron");
		al2.add(4);
		al2.add('A');
		al2.add(45.87);
		
		// hetorogeneous type of data is allowed
		System.out.println(al2);
		
		System.out.println("******************");
		
		ArrayList al3 = new ArrayList();
		
		// we can add entire collection into another collection
//		al3.add(al2);
//		System.out.println(al3);
//		System.out.println("***************");
//		System.out.println(al3.get(0));
		
//		System.out.println("*************");
		
		al3.addAll(al2);
		System.out.println(al3);
		
		System.out.println("*****************");
		
		ArrayList al4 = new ArrayList();
		al4.add(11);
		al4.add(22);
		al4.add(33);
		al4.add(44);
		
		System.out.println("Existing array list " + al4);
		
		al4.add(2,28);
		System.out.println("After adding in 2nd index " + al4);
		al4.add(0,5);
		System.out.println("After adding in 0th index " + al4);
		al4.add(66);
		System.out.println("After adding in rear end " + al4);
		al4.addAll(1, al2);
		System.out.println("****************");
		System.out.println(al4);
		
	}

}
