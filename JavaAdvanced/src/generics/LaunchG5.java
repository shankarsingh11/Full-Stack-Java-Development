package generics;

import java.util.*;

public class LaunchG5 {

	public static void main(String[] args) {
		
		// All of them same 
		// Generics code 
        ArrayList<Integer> al = new ArrayList();
 //       ArrayList<Integer> al = new ArrayList<>();
  //      ArrayList<Integer> al = new ArrayList<Integer>();
        
        al.add(10);
        al.add(100);
        al.add(new Integer(200));
  //      al.add(new String("shankar")); // CE 
        
        System.out.println(al);
		
		
	}

}
