package collection;

import java.util.ArrayList;

public class LaunchTest2 {

	public static void main(String[] args) {
		
		
		// Array are   "TypeSafety"
		
		String [] s = new String[10];
		s[0] = "shankar";
		s[1] = "hyder";
		
	String name1 = s[0]; // TypeCasting not required 
	String name = s[1];
	
// Collection ==> TypeSafety and TypeCasting is not required
// Use generic features available from java 1.5v 	
		
		// Collection are not "TypeSafety"
		
		ArrayList al = new ArrayList();
		al.add("Rohit");
		al.add("Deep");
		al.add(new Integer(10));
		
		
// we assume the element present inside  ArrayList is  String and we do retrieval
		
	//	String name1 =  al.get(0); // CE : bcz TypeCAsting is required
	//	String name2 =  al.get(1);
	
		
		
	}

}
