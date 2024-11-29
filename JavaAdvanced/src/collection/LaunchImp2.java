package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LaunchImp2 {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add("shankar");
		al1.add(12.5);
		al1.add(30.67f);
		al1.add('C');
		
		System.out.println("ArrayList data");
		System.out.println(al1);
		// loop normal
		System.out.println("Acess data using a normal loop");
		for(int i = 0;i<al1.size();i++)
		{
//			Object o = al1.get(i);
//			System.out.print(o+", ");
			System.out.print(al1.get(i)+ ", ");
		}
		System.out.println();
		// Using Iterator 
		
//		System.out.println("integer type data access only");
//		Iterator<Integer> itr = al1.iterator();
//		
//		while(itr.hasNext())
//		{
//			Integer i =  itr.next();
//			System.out.print(i+", ");
//		}
		
		System.out.println();
		
		System.out.println("Access the data using Iterator");
		
		Iterator itr1= al1.iterator();
		// Ascending order
		while(itr1.hasNext())
		{
			Object i =  itr1.next();
			System.out.print(i+", ");
		}
		
		System.out.println();
		System.out.println("Access data in ascending order using ListIterator");
		// ListIterator is bidirectional
		ListIterator litr1 = al1.listIterator(al1.size());
		
		while(litr1.hasPrevious())
		{
			Object o = litr1.previous();
			System.out.print(o+", ");
		}
		System.out.println();
		System.out.println("Access data in reverse order using ListIterator");
		
		while(litr1.hasNext())
		{
			Object o = litr1.next();
			System.out.print(o+", ");
		}
		

	}

}
