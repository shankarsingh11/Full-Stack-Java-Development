package OOPs.inheritance;

class Parent102{
	private String name;
	
	void disp() {
		System.out.println("Parent is : " + name);
	}
}

class Child11 extends Parent102{
	
	  void disp2() {
		 // name = "shankar";  private members will not participate in inheritance 
	  }
}

public class LaunchPrivateMember {

	public static void main(String[] args) {
		Child11 c = new Child11();
        c.disp();
	}

}
