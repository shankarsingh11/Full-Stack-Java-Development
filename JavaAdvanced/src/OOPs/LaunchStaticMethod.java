package OOPs;


class DemoClass{
	  static int a;
	  
	  static {
		  a = 10;
		  System.out.println("Staic Block");
		  
	  }
	  
	  static void disp() {
		  System.out.println(" static disp : " + 10);
	  }
	  
	  
}
public class LaunchStaticMethod {
	
	
	static {
		System.out.println("hello");
	}
	
	static void disp1() {
		System.out.println("Disp1 is 1 ");
	}

	public static void main(String[] args) {
	
		System.out.println("Main Method ");
		disp1();
		DemoClass.disp();
		
		DemoClass s = new DemoClass();
		s.disp();
		

	}

}
