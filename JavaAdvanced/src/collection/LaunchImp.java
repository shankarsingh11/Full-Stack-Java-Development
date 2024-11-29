package collection;

import java.util.*;

public class LaunchImp {

	public static void main(String[] args) {
		
		//index based indexing  allowed in ArrayList
		ArrayList al1 = new ArrayList();
		
		al1.add(10);   //al1.add(new Integer(10))
		al1.add(10.5); //al1.add(new Double(10))
		al1.add('A');  //al1.add(new Character(10))
		al1.add(5.2f); //al1.add(new Float(10))
		al1.add("shankar");// auto boxing
		
		System.out.println(al1);
		
		System.out.println("************");
		ArrayList al2 = new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(50);

		System.out.println(al2);
		// diff ways to access data present in collection
		// loop normal	
		System.out.println("Size is : "+al2.size());
		System.out.println("*********");
		for(int i =0;i<al2.size();i++)
		{
//			Object o = al2.get(i);
//			System.out.println(o);
			
			System.out.print(al2.get(i)+" ");
		}
		
		System.out.println();
		// for each loop
		System.out.println("************");
		for(Object obj : al2)
		{
			System.out.print(obj+" ");
		}
		
		//Iterator
		System.out.println();
		System.out.println("***************");
		
//		Iterator<Integer> itr1 = al2.iterator(); // Argument type iterator 
		Iterator itr1 = al2.iterator();
		
//		if(itr1.hasNext()==true)
//		{
//			itr1.next();
//			
//		}
		
		while(itr1.hasNext())
		{
//			Integer i = (Integer) itr1.next();
//			System.out.print(i+" ");
//			Object o = itr1.next();
//			System.out.print(o+" ");
			
			System.out.print(itr1.next()+" ");
		}
		System.out.println();
		
		System.out.println("Reverse");
		
		ListIterator litr = al2.listIterator(al2.size());
		
		while(litr.hasPrevious())
		{
			
			System.out.println(litr.previous());
		}

// what if i want to reverse or access data of other classes in reverse dif?
		
		System.out.println("Array Deque ***********");
		// indexed based indexing is not allowed in ArrayDeque 
		ArrayDeque adq = new ArrayDeque();
	//	TreeSet adq = new TreeSet();
		
		adq.add(100);
		adq.add(200);
		adq.add(300);
		adq.add(400);
		adq.add(500);
		System.out.println(adq);
		System.out.println("*******************");
		Iterator it = adq.iterator();
		
	//	System.out.println(adq.iterator());
		
		// in ascending order
		System.out.println("ArrayDeque data In Ascending Order");
		while(it.hasNext()==true)
		{
			Integer i = (Integer) it.next();
			System.out.println(i);
		}
		
		System.out.println("ArrayDeque data In Reverse Order");
		
		System.out.println("Added in LinkedList");
		LinkedList ll = new LinkedList();
		
		ll.addAll(adq);
		System.out.println(ll);
		
		ListIterator litr2 = ll.listIterator(ll.size());
		
		System.out.println("Access the ArrayDeque data in reverse order ");
		while(litr2.hasPrevious())
		{
			Integer i = (Integer) litr2.previous();
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		

	}

}
