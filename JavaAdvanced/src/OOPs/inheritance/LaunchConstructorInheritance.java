package OOPs.inheritance;

class Parent11{
	
	String name;
	
	Parent11(){
		System.out.println("Parent Constructor");
	}
	
	void disp() {
	 System.out.println("Parent :" + name);	
	}
	
}

class Sub extends Parent11{
	
	/*
	Sub(){
		super();
	}
	
	*/
	
//	void disp2() {
//		
//	}
	
}

public class LaunchConstructorInheritance {

	public static void main(String[] args) {
		
      Sub s = new Sub();
        s.disp();
	}

}
