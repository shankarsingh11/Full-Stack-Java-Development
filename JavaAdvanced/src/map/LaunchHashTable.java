package map;

import java.util.Hashtable;

class Ineuron
{
  int i;
  
  public Ineuron(int i)
  {
	  this.i=i;
  }
  
  @overide
  public String toString()
  {
	  return (i + " ");
  }
  
  
}

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
		
   // equals() : HashMap
   //==:IdentityHashMap		
		
		
		Hashtable ht = new Hashtable();
		
		ht.put(12, "shankar");
		ht.put(11, "Nitin");
		
		System.out.println(ht);
		
		Hashtable ht2 = new Hashtable();
		
		ht2.put(new Ineuron(11), "shankar");
		ht2.put(new Ineuron(13), "Deepak");
		ht2.put(new Ineuron(10), "Stuti");
		
		System.out.println(ht2);
		
		
		
		
		
	}

}
