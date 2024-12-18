package collection;

import java.util.ArrayList;

public class LaunchTest {

	public static void main(String[] args) {
		
		
		// Array are   "TypeSafety"
		
		String [] s = new String[10];
		s[0] = "shankar";
		s[1] = "hyder";
		
	//	s[2] = new Integer(10); // CE => Unresolved compilation problem
		
		
		// Collection are not "TypeSafety"
		
		ArrayList al = new ArrayList();
		al.add("Rohit");
		al.add("Deep");
		al.add(new Integer(10));
		
		
// we assume the element present inside  ArrayList is  String and we do retrieval
		
		String name1 = (String) al.get(0);
		String name2 = (String) al.get(1);
	//	String name3 = (String) al.get(2); //RE => ClassCastException 
		
		
	}

}
