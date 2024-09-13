package OOPs.inner;

class A1
{
	public void show()
	{
		System.out.println("in my show");
	}
	
	// inner class is static 
	// static class  possible only inside a inner class
	static class A11
	{
		public void config()
		{
			System.out.println("in my config");
		}
	}
	// inner class 
	class A12
	{
		public void dep()
		{
			System.out.println("Development");
		}
		
		
		class A121
		{
			public void disp()
			{
				System.out.println("Display");
			}
		}
	}
	
}

public class SecondInnerClass {

	public static void main(String[] args) {
		
		A1 a1 = new A1();
		a1.show();
		
		// when a class B1 is static then create a object using class name A1
		A1.A11 a11 = new A1.A11();
		a11.config();
		
		//when a class B1 is non-static then create a object using class A1 object
		A1.A12 a12 = a1.new A12();
		a12.dep();
		
		A1.A12.A121 a121;
		a121  = a12.new A121();
		a121.disp();
	}

}
