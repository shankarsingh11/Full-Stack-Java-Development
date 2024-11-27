package collection;

import java.util.ArrayDeque;

public class LaunchADQ {

	public static void main(String[] args) {
	
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(30);
		ad.add(40);
		
		System.out.println(ad);
		ad.addFirst(5);
		ad.addLast(50);
		System.out.println(ad);
		

	}

}
