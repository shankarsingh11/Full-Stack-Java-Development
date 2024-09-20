package WrapperClass;


class Demo4
{
  public void m3(long x) {
	  System.out.println("long");// first priority
  }	
  
  public void m3(int...x)
  {
	  System.out.println("var-args method");// second priority 
  }
  
}
public class VarAgrsTypeCasting {

	public static void main(String[] args) {
		Demo4 d4 = new Demo4();
		int x =10;
		d4.m3(x);// int ==> typecasting ==> long(match) 
		d4.m3(10,30);

	}

}
