package collection;

import java.util.*;

public class LaunchLL {

	public static void main(String[] args) {
		
//		LinkedList<Integer> ll3 = new LinkedList<>();//  store only a Integer Types object
//		LinkedList<Integer> ll4 = new LinkedList<Integer>(); //  store only a Integer Types object

//		System.out.println(ll3);// []
//		System.out.println(ll4);// []
			
		
		LinkedList ll1 = new LinkedList(); //  store  heterogeneous Types object
		
		ll1.add(11);
		ll1.add("shankar");
		ll1.add('B');
		ll1.add(2.5);
		
		System.out.println(ll1);
		ll1.add(0,"hyder");
		System.out.println(ll1);
		ll1.add(3,"Benguluru");
		System.out.println(ll1);
		ll1.add(6,"New York");
		System.out.println(ll1);
		ll1.add(7,"America");
		System.out.println(ll1);
		
		System.out.println("***************");
		
		LinkedList ll2 = new LinkedList();
		
		ll2.add(100);
		ll2.add(200);
		ll2.add(300);
		ll2.add(400);
		ll2.add(300);
		
		System.out.println(ll2.getFirst());//100
		System.out.println(ll2.getLast());//400
		System.out.println(ll2.getClass());// class java.util.LinkedList
		System.out.println(ll2.element());// 100
		System.out.println(ll2.lastIndexOf(300));// 4
		ll2.removeLastOccurrence(300);
		System.out.println(ll2.lastIndexOf(300));// 2
		
		System.out.println("**************");
		
		System.out.println(ll2);
		System.out.println(ll2.peekFirst());
		System.out.println(ll2);
		System.out.println(ll2.pollFirst());
		System.out.println(ll2);
		System.out.println(ll2.peek());
		System.out.println(ll2.poll());
		System.out.println(ll2);
		
		
	}

}
