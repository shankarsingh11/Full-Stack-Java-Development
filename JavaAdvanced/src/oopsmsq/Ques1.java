package oopsmsq;

public class Ques1 {

	public static void main(String[] args) {
		System.out.println("welecome ");
		Long tail = 2000L;
		Long distance = 1999L;
		Long story = 1000L;
		
		if((tail>distance) ^ ((story * 2) == tail)) {    // T ^ T ==> F
			System.out.println("1");                     // T ^ F ==> T
			                                             // F ^ T ==> T     
		}
		
		if((distance + 1 != tail) ^ ((story * 2) == distance)) { // F ^ F ==> F
			System.out.println("2");
		}
		

	}

}
