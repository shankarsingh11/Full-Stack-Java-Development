package collection;

import java.util.*;

public class LaunchTS {

	public static void main(String[] args) {
		
        TreeSet ts = new TreeSet();
        
        ts.add(20);
        ts.add(10);
        ts.add(25);
        ts.add(100);
        ts.add(30);
        ts.add(50);
        ts.add(15);
        
        System.out.println(ts);
        System.out.println("***********");
        
        System.out.println(ts.ceiling(20));
        System.out.println(ts.higher(20));
        System.out.println(ts.floor(20));
        System.out.println(ts.lower(20));
        
        System.out.println("**************");
        
        System.out.println(ts.ceiling(35));
        System.out.println(ts.higher(35));
        System.out.println(ts.floor(35));
        System.out.println(ts.lower(35));
        
       
        
        
	}

}
