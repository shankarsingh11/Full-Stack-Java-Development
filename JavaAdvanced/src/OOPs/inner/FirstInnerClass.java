package OOPs.inner;

class A
{
	private int num;
	// Object created class B when create a object class A first
	 B b = new B(); 
	
	 public void show() {
		 
		 //Object create when method show call by class A object
		// B b = new B();
		 
		 System.out.println("in show  " + num);
		 b.config(); // this method call only when show method call first
	 }
	 
	 // Inner class 
	 class B
	 {
		 private int s;
		 
		 public void config() 
		 {
			System.out.println("config " + num + s); 
		 }
	 }
}


public class FirstInnerClass {

	public static void main(String[] args) {
	A a = new A();
	a.show();
	

	}

}
