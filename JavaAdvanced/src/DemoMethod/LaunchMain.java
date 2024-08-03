package DemoMethod;

// can  we overload main method in java ?
// yes , we can overload main method however JVM will call a such main which having a parameter  as  String arguments

public class LaunchMain {

	public static void main(String[] args) {
		System.out.println("Its actual main method ");

	}
	
	public static void main(int [] args) {
		System.out.println("acceptin int args");

	}
	
	public static void main(double  args) {
		System.out.println("accepting double args  ");

	}
	
	public static void main(float [] args) {
		System.out.println("Its actual main method ");

	}
	
	

}
