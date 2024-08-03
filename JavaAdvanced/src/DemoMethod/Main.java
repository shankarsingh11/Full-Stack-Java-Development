package DemoMethod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = 10,b = 20,c = 30;
		float m = 12.3f,n = 22.5f,o = 13.4f;
		double p = 34.5,q = 33.8,r = 49.58;
		
		Calculator1 calc1 = new Calculator1();
		
		System.out.println(calc1.add(a, b));
		System.out.println(calc1.add(a, b,c));
		System.out.println(calc1.add(p, m));
		System.out.println(calc1.add(p, q,r));
		System.out.println(calc1.add(p, m,b));
		System.out.println(calc1.add(n,c));
		System.out.println(calc1.add(m,n,o));
		
		

	}

}
