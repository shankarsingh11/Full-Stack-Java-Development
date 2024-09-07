package OOPs.interfaceconcepts;


// class&class extends
// class&interface implements
// class extends class & implements interfaces

interface IDemo1
{
	void m1();
	
}

interface IDemo2
{
   void m2();	
}

// Using a extends keyword interface extends a one or more class at same time
interface IDemo3 extends IDemo1,IDemo2
{
  void m3();	
}


class Demo1Impl
{
	
	
}

//first one class extends only one class and then one class implements one or more interfaces at a time 
class Demo2Impl extends Demo1Impl implements IDemo3
{

	@Override
	public void m1() {
		System.out.println("hey method m1");
		
	}

	@Override
	public void m2() {
		System.out.println("hey method m2");
		
	}

	@Override
	public void m3() {
		System.out.println("hey method m3");
		
	}
	
	
}
public class DemoApp {

	public static void main(String[] args) {
		
		IDemo3 demo = new Demo2Impl();
		demo.m1();
		demo.m2();
		demo.m3();
	}

}
