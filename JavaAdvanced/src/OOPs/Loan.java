package OOPs;

import java.util.Scanner;

class Farmer{
	
	private float pa;
	private float td;
	private float si;
	private static float ri;
	
	static {
		
		ri = 10.5f;
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly enter a principal amount ");
		pa = sc.nextFloat();
		System.out.println("Kindly enter a time duration");
		td = sc.nextFloat();
		}
	
	void compute() {
		
		si = (pa*td*ri)/100;
	}
	
	void disp() {
	  System.out.println("SI is : " + si);	
	}
	
}

public class Loan {

	public static void main(String[] args) {
		
		Farmer m = new Farmer();
		
		 m.input();
		 m.compute();
		 m.disp();

	}

}

