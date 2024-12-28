
package OOPs;


class Demo{
	
	
	static int a;
	static int b;
	
	static { 
		
		System.out.println("static block");
		a=10;
		b=20;	
	}
	
	static void demo() {
		
		System.out.println("static method");
		System.out.println(a);
		System.out.println(b);
	}
	
	Demo(){
		a = 100;
		System.out.println("Constractor");
		System.out.println(a);
	}
	
	
	int x;
	int y;
	
	{
		b=200;
		System.out.println("Non static block");
		System.out.println(b);
	    x=10;
	    y=20;
	    System.out.println(x);
	    System.out.println(y);
	}
	
	void demo1() {
		a = 110;
		b = 300;
		System.out.println("non static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		
	}
}

public class StaticKeywordDemo {

	public static void main(String[] args) {
		
		Demo.demo();
		Demo m = new Demo();
		m.demo1();
	}

}
