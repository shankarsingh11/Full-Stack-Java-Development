package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LaunchG {

	public static void main(String[] args) {
	
//  <String> or <T> =====> Typeparameter
//   List           =====> Baseparameter
		
		List<String> l1 = new ArrayList<String>(); // valid
		Collection<String> l2 = new ArrayList<String>(); // valid
		ArrayList<String> l3 = new ArrayList<String>(); // valid 
	//	ArrayList<Object> l4 = new ArrayList<String>(); // invalid
		
	//    ArrayList<int> l5 = new ArrayList<int>(); //invalid
		
		
		

	}

}
