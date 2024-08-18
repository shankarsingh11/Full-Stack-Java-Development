package OOPs.polymorphism;

class Parents
{
	public void cry()
	
	{
		System.out.println("Parents crying");
	}
	
	}

class Child11 extends Parents
{
	public void cry()
	{
		System.out.println("Child 1 is crying at low voice");
	}
	
	public void eat()
	{
		System.out.println("child 1 is eating a food");
	}
}

class Child12 extends Parents
{
	public void cry()
	{
		System.out.println("child 2 is crying at high voice");
	}
	
	public void eat()
	{
		System.out.println("child 2 is eating a food");
	}
}

public class LaunchConceptsPoly {

	public static void main(String[] args) {
		// loose coupling
		Parents p1 = new Child11();
		Parents p2 = new Child12();
		p1.cry(); // upcasting
		//p1.eat();// directly using parents type reference you can not access the child class specialized method  
		((Child11) p1).eat();// Downcasting
		p2.cry();
		((Child12) p2).eat();
	
	}

}
