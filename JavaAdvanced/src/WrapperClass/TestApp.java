package WrapperClass;

public class TestApp {
	int n = 10;
	public TestApp(int n) {
		super();
		this.n = n;
	}
	
	public TestApp modify(int n) {
		if(this.n == n) {
			return this;
		}else {
			return new TestApp(n); 
		}
		
	}

	public static void main(String[] args) {
		
		TestApp t1 = new TestApp(10);
		TestApp t2 = t1.modify(10);
		TestApp t3 = t1.modify(100);
		TestApp t4 = t3.modify(100);
		
		
		System.out.println(t1==t2);// true
		System.out.println(t1==t3);// false
		System.out.println(t3==t4);// true
		System.out.println(t3==t2);// false
	}

}
