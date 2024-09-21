package importstatement;

// informing the compiler plz search for ArrayList class in "Java.util"
import java.util.ArrayList;// Explicit import
import java.util.*;// Implicit import

public class Test {

	public static void main(String[] args) {
		System.out.println("hello");
		
		// java.util.ArrayList al = new java.util.ArrayList(); // fully Qualified name
		//ArrayList a = new ArrayList();
		
		ArrayList l = new ArrayList();
		System.out.println(l);
	}

}
