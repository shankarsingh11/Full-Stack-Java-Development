package map;

import java.util.*;
import java.util.Map.Entry;
public class LaunchMaps {

	public static void main(String[] args) {
		
	   // Map m = new HashMap();
		// jdk 1.2v
		
		// order of insertion is not maintain 
		HashMap hm = new HashMap();
		
		hm.put(10, "Sachin"); // Entry
		hm.put(20, "MSD");
		hm.put(30, "Kohli");
		
		System.out.println(hm);
		
		System.out.println(hm.get(10));
		
		System.out.println("**Value***");
		
		Collection c = hm.values();
		Iterator itr1 = c.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("**KeySet**");
		
		Set s = hm.keySet();
		Iterator itr2 = s.iterator();
		
		while(itr2.hasNext())
		{
			// System.out.println(itr2.next());
			
			Integer i = (Integer) itr2.next();
			System.out.println("key : " + i);
		}
		
		System.out.println("**EntrySet**");
		
		Set st = hm.entrySet();
		Iterator itr3 = st.iterator();
		
		while(itr3.hasNext())
		{
		 // 	System.out.println(itr3.next());
		  
			Map.Entry  data = (Entry) itr3.next();
			System.out.println(data.getKey() + " : " + data.getValue());
		
			
		}
		
		
		System.out.println("***********");
		
		//jdk 1.4v
		// maintain order of insertion
		
		LinkedHashMap lhm = new LinkedHashMap();
        
		lhm.put(20, "Vishnu");
		lhm.put(5, "James");
		lhm.put(40, "Devin");
		lhm.put(30, "harry");
		
		System.out.println(lhm);
		
		
		
	}

}
