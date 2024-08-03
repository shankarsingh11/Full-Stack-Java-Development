package RecProblem;


class Fib{
	
	int fib(int n) {
		if(n==0 || n==1) return n;
		
		return fib(n-1) + fib(n-2);
	}
	
	
}
public class Fibonnaci {

	public static void main(String[] args) {
		
		Fib num = new Fib();
		 System.out.println(num.fib(10));
	
	}

}
