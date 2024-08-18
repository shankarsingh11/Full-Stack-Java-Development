package OOPs.polymorphism;

class Parent1{
	
	public void cry()
	{
		System.out.println("parent is cry");
	}
	
}

class Child1 extends Parent1
{
	public void cry()
	{
		System.out.println("child1 is cry at low voice");
	}
}

class Child2 extends Parent1
{
	public void cry()
	{
		System.out.println("child2 is cry at high voice");
	}
}

public class LaunchPolymorphism {

	public static void main(String[] args) {
		
		// tight coupling
		Child1 c1  = new Child1();
		Child2 c2 = new Child2();
		// loose coupling
		//Parent1 ref = new Child1();
//		c1.cry();
//		c2.cry();
		
		Parent1 ref;
		ref = c1;
		ref.cry();
		 
		ref=c2;
		ref.cry();

	}

}
