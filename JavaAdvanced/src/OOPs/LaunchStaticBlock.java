package OOPs;

class DemoClass2{
  static int a;
  
  static {
	  a = 10;
	  System.out.println("Static Block");
  }
  
  static void disp1() {
	  System.out.println("Static Disp1 is : "+a);
  }
  
  
  void disp2() {
	  
  }
  
  void disp3() {
	  disp2();
	  disp1();
  }
  
}



public class LaunchStaticBlock {
	
	static int a;
	
	// first call static block
	static {
		a =10;
		System.out.println("Static Block");
		System.out.println(a);
	}
	
  // After static block call main method 
	public static void main(String[] args) {
		
		System.out.println("Main Method ");

	}

}
