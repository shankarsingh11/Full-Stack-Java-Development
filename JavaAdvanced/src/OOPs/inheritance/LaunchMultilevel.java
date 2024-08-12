package OOPs.inheritance;

class Demo11{ //  extends Object class
	
	// Object properties and method 
	
	String name = "Deepak";
	int age = 24;
	
	void disp() {
		System.out.println("Disp is : " + name + " " + age);
	}
	
}
class Demo12 extends Demo11{
	
}
class Demo13 extends Demo12{
	
}

class Demo14 extends Demo11{
	
}



public class LaunchMultilevel {

	public static void main(String[] args) {
		 Demo13 d = new Demo13();
		 d.disp();

	}

}
