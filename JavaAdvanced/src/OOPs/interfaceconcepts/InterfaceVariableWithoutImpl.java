package OOPs.interfaceconcepts;

interface IRemote
{  
	// interface variables are public static final
	// interface variable can access without implements a class
	
   int MIN_VALUE=0;  // public static final
   int MAX_VALUE=10;
}

public class InterfaceVariableWithoutImpl {

	public static void main(String[] args) {
		
		System.out.println(IRemote.MIN_VALUE);
	    System.out.println(IRemote.MAX_VALUE);

	}

}
