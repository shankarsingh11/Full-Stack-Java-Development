package OOPs.inheritance;

class Demo111{
	String name = "Rohit Singh";
	int age = 24;
	
	void disp() {
		System.out.println("Disp is : " + age + " " + name);
	}
	
}

class Demo112 extends Demo111{
	
}

class Demo113 extends Demo111{
	
}

class Demo114 extends Demo112{
	
}

public class LaunchHierarchy {

	public static void main(String[] args) {
		Demo113 dm = new Demo113();
		dm.disp();

	}

}
