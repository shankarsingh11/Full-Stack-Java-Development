package map;

import java.util.Hashtable;


public class LaunchHashTable {

	public static void main(String[] args) {
		
		// 1.0v ( Legacy classes)
		
	// Hashtable java 1.0v
	// HashMap java 1.2v
	
   // Hashtable - synchronized (Multithreading not possible)
  // HashMap - non synchronized (Multithreading possible )

	//Hashtable - Thread safe
	//HashMap - not safe
		
	// Hashtable - Low performance
	// HashMap - high performance	
		
		
		Hashtable ht = new Hashtable();
		
		ht.put(11, "shankar");
		ht.put(12, "Nitin");
		
		System.out.println(ht);
		
		
		
		
	}

}
