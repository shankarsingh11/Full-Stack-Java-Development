package WrapperClass;

// WAP to take a inputs from command line and perform arthmetic operation 
// valueOf()  =>convert string/primitive type to wrapper object
// xxxValue() =>convert wrapper object type to primitive type
// parseXXX() =>convert string to primitive type 

public class UseOfUtilityMethod {

	public static void main(String[] args) {
		
		// commandLine arguments => String inputs = args[0],args[1]
		
		// System.out.println(args[0] + args[1]);
		
		int i1 = Integer.parseInt(args[0]);
		int i2 = Integer.parseInt(args[1]);
		
		System.out.println("Arthmetic operation : ");
		
		System.out.println(i1+i2);
		System.out.println(i1-i2);
		System.out.println(i1*i2);
		System.out.println(i1/i2);
		System.out.println(i1%i2);


	}

}
