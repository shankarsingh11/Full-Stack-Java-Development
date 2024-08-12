package OOPs.inheritance;

class Demo1{ // extends object class
	
	String name = "shankar";
	int age = 23;
	
	void disp() {
		System.out.println("disp is :" + age +" " + name);
	}
}

class Demo2 extends Demo1{
	
	
}
 // Demo1 is parent class / base class /existing class
// Demo2 is child class/sub/derived

public class LaunchInheritance1 {

	public static void main(String[] args) {
		Demo2 demo = new Demo2();
		demo.disp();
	
	}

}
