package functionalinterface;


class Parent
{
  public static void disp()
  {
	  System.out.println("Hello Parent");
  }
}

class Child1 extends Parent
{
  	public static  void disp()
  	{
  		System.out.println("Hello Child1");
  	}
}


public class MethodHiding {

	public static void main(String[] args) {
		
		Parent p = new Child1();
		p.disp();
		Child1 c = new Child1();
		c.disp();
		
	}

}
