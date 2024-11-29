package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LaunchImp4 {

	public static void main(String[] args) {
		
		LinkedList ll1 = new LinkedList();
		ll1.add(100);
		ll1.add(200);
		ll1.add(300);
		ll1.add(400);
		ll1.add(500);
		
		System.out.println(ll1);
		System.out.println("*****************");
		
		// Only in LinkedList , ArrayDeque , TreeSet
		
		Iterator ditr = ll1.descendingIterator();
		
		while(ditr.hasNext())
		{
			
//			Integer i = (Integer) ditr.next();
//			System.out.print(i + ", ");
			
			System.out.print(ditr.next()+", ");
		}
		
		System.out.println();

	}

}
