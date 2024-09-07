package OOPs.interfaceconcepts;

interface IDemo
{   // SRS
	// All Valid declaration and initialization
	public int n1 = 1;
	public final int n2 = 2;
	public static int n3 = 3;
	public final static int n4 = 4;
    public static final int num=10;
}

public class InterfaceVariableConcepts  implements IDemo{

	public static void main(String[] args) {
		
		System.out.println(n4); //4 
		
		int n4 = 11;// local variable 
		
	    System.out.println(n4);// 11

	}

}
