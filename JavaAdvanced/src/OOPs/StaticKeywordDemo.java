

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
		
		System.out.println("Constractor");
	}
	
	
	int x;
	int y;
	
	{
		System.out.println("Non static block");
	    x=10;
	    y=20;
	}
	
	void demo1() {
		System.out.println("non static method");
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
