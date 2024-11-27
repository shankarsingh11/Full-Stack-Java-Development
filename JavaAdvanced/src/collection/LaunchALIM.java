package collection;

import java.util.*;

public class LaunchALIM {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		
		System.out.println(al1);
		
//		boolean res = al1.contains(30);
//		System.out.println(res);// true
		
		System.out.println(al1.contains(30)); // true
		
//		int index = al1.indexOf(20);
//		System.out.println(index);// 1
		
		System.out.println(al1.indexOf(20));// 1
		
		System.out.println(al1.isEmpty());// false
		
		System.out.println("***********");
		al1.add(20);
		al1.add(50);
		
		System.out.println("last index of 20 : "+al1.lastIndexOf(20));//4
		System.out.println("at index 3 : "+ al1.get(3));// 40
		
		al1.ensureCapacity(10);
		
		System.out.println("Size of ArrayList : "+al1.size());
		al1.trimToSize();
		System.out.println(al1.getClass());
		
	  ArrayList al2 =	(ArrayList) al1.clone();
	  System.out.println(al2);
	  
	  al1.add(60);
	  System.out.println(al1);
	  System.out.println(al2);
	  al2.clear();
	  System.out.println(al2);
	  System.out.println(al2.size());
	  
		
		
		 
	}

}
