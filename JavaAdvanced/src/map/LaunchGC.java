package map;

import java.util.HashMap;
import java.util.WeakHashMap;

class Employee
{
   private int empid;
   private String name;
   private String empAddr;
   
   @overide
   public String toString() {
	   return "shankar";
   }
   
   @overide
   public void finalize() {
	   System.out.println("Garbage collector collected the object");
   }
   
   // setter
   //getter

}

// Garbage collector(GC)
  
public class LaunchGC {

	public static void main(String[] args) {
		
      Employee e1 = new Employee();
      
      // hashMap dominating the garbage collector
      // HashMap hm = new HashMap();
      
      
      // hashMap not dominating the garbage collector 
      WeakHashMap hm = new WeakHashMap();
      
       hm.put(e1, "shankar");
       
      // statement
      //statement
      
      e1=null;// eligible for garbage collection
		
      System.gc(); // call to garbage collector (GC)
      
      System.out.println("Last line");
      
	}

}
