package OOPs;


class Demo1{
	int a;
	int b;
	
	static int count;
	
	{
		count++;
		System.out.println("Hello");
	}
	
	Demo1(){
		
		this(100);
		System.out.println("First Constractor ");
	}
	
	Demo1(int a){
		
		System.out.println(a);
		this.a=a;
		System.out.println(a);
	}
	
	Demo1(int a,int b){
		System.out.println(b);
		this.a=a;
		this.b = b;
		System.out.println(a);
		System.out.println(b);
		
	}
	
	
}

public class NonStaticFlow {

	public static void main(String[] args) {
		
		Demo1 s1 = new Demo1();
		Demo1 s2 = new Demo1(10);
		Demo1 s3 = new Demo1(10,20);
		
		System.out.println(Demo1.count);
		

	}

}
