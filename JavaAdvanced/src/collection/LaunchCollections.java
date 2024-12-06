package collection;
import java.util.*;

public class LaunchCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  100 50 150 25 75 125 175
		
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		
		System.out.println(ts);
		
		System.out.println("*************");
		
		ArrayList al1 = new ArrayList();
		
		al1.add(100);
		al1.add(50);
		al1.add(150);
		al1.add(25);
		al1.add(75);
		al1.add(125);
		al1.add(175);
		
		System.out.println(al1);
		
		// Diff B/W Collection vs Collections
		
		// Collection => is a Interface
		// Collections => is a individual inbuilt class
		
		Collections.sort(al1);
		System.out.println("After Sorting ");
		System.out.println(al1);
		
		System.out.println("*********************");
		
		ArrayList <String> al2 = new ArrayList<String>();
		
		//al2.add(100); // error
		al2.add("shankar");
		al2.add("Hyder");
		al2.add("hyder");
		al2.add("deep");
		// al2.add(20); // error
		
		Collections.sort(al2);
		
		System.out.println(al2);
		
		System.out.println("*****************");
		
		ArrayList<Integer> al3 = new ArrayList<>();
		
		//al3.add("shankar"); // error
		
		al3.add(1000);
		al3.add(200);
		
		Collections.sort(al3);
		System.out.println(al3);
		
//Few  More  important inbuilt methods of Collections class
		
		ArrayList al4 = new ArrayList();
		
		al4.add(10);
		al4.add(20);
		al4.add(30);
		al4.add(40);
		al4.add(50);
		
		int index = Collections.binarySearch(al4, 30);
		System.out.println("index " + index);
		
		System.out.println(Collections.frequency(al4,40));
		
		System.out.println(Collections.min(al4));
		System.out.println(Collections.max(al4));
		System.out.println(Collections.EMPTY_LIST);
		Collections.shuffle(al4);
		System.out.println(al4);

		
		  
		
	}

}
