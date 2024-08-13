package OOPs.inheritance;

class Demo10{
	
	public void disp() {
		
		System.out.println("Parents display");
	}
	
	void disp2() {
		
		System.out.println("default Method");
	}
	
	public int add() {
		
		return 10+20;
	}
	
}

class Demo22 extends Demo10{
	 
//	void disp() {   // we can not Reduce a visibility 
//		System.out.println("Child class");
//	}
	
	public void  disp2() {  // Increase visibility void to public 
		
		System.out.println("Public method bcoz increase visibility");
	}

	
//public void add() {  //  return type  must be same in overriding a method 
	
//	 return 10+20;
 // }
	

	public int add() {  // return type same in overriding 
		int a,b,c;
		a = 10;
		b=40;
		c= 10+40;
		return c;
	}	
}

public class LaunchRulesOverridden {

	public static void main(String[] args) {
	
		
		
	}

}
