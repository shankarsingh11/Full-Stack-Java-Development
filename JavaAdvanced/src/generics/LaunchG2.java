package generics;

// User defined a generic class

class Gen<T>
{
   T obj; // T type --> Integer,String,Double ....
   
   Gen(T obj){
	   this.obj = obj;
   }
   
   public void show() {
	   
	   System.out.println("The type of object is : " + obj.getClass().getName());
   }
   
   public T getObj() {
	   
	   return obj;
   }
   

}

public class LaunchG2 {

	public static void main(String[] args)
	{
		Gen<Integer> g1 = new Gen<Integer>(10);
		g1.show();
		System.out.println(g1.getObj());
		
		
		Gen<String> g2 = new Gen<String>("Shankar");
		g2.show();
		System.out.println(g2.getObj());
		
		Gen<Double> g3 = new Gen<Double>(10.6);
		g3.show();
		System.out.println(g3.getObj());
		
		
	}
}
