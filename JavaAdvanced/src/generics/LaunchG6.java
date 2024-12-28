package generics;

import java.util.*;


public class LaunchG6 {

	public static void main(String[] args) {
		
		
		// working with generic code (java1.5v)
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("navin");
  //		al.add(10); // CE 
		
		m1(al);
		System.out.println(al);// [navin, 10, sachin, 10, true]
		
		

	}
	
	
	// working with non-generic code java1.4v
	
	public static void m1(ArrayList al) { // ArrayList al = new ArrayList<String>();
		
		al.add(10);
		al.add("sachin");
		al.add(new Integer(10));
		al.add(true);
		
	}

}
