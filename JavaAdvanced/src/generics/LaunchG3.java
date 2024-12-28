package generics;


// Number ---> Byte , Short,Integer,Float , Double 

// Makes generic specific 

class Gen2<T extends Number>
{
	 

}

class Gen3<T extends Runnable>
{
         
	
}
public class LaunchG3 {

	public static void main(String[] args) {
		
          Gen2<Integer> g1 = new Gen2<Integer>();
          Gen2<Float> g2 = new Gen2<Float>();
  //        Gen2<String> g3 = new Gen2<String>(); // invalid
          
          Gen3<Runnable> g4 =  new Gen3<Runnable>();
          Gen3<Thread> g5 =  new Gen3<Thread>();
          
	}

}
