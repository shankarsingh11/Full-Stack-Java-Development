package collection;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchFFFS {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.add(300);
		al1.add(400);
		
		// infinit loop 
		
//		for(int i = 0 ; i<al1.size();i++) {
//			System.out.println(al1.get(i));
//			al1.add(500);
//		}
		
		Iterator itr = al1.iterator();
		
		// fail fast
		while(itr.hasNext()) {
			System.out.println(itr.next());
			// al1.add(500);
		}
		
		
		// failsafe
		
		CopyOnWriteArrayList cal = new CopyOnWriteArrayList();
		
		cal.add(1000);
		cal.add(2000);
		cal.add(3000);
		cal.add(4000);
		
		Iterator itr2 = cal.iterator();
		
		while(itr2.hasNext())
		{
           System.out.println(itr2.next());
           cal.add(1234);
		}
				
		
	}

}
