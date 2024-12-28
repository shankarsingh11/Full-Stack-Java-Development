package annotations;

// Annotations java 5

// Annotations ---> Annotations --> parents of all annotations
//             ---> Built in
//             ---> Custom or Userdefine (Our own )



// You can use --> Annonatation
// class
// interface
// method
// fields // instance variable 
// constructor
// local variables
// parameters
// enum



@FunctionalInterface
interface Trail
{
  int getNum();
 // void disp();

}

class Javalearning 
{
   public void disp2()
   {
	   System.out.println("Parent disp");
	   
   }

}


class Focus extends Javalearning
{
	@Override
	 public void disp2()
	 {
		 System.out.println("Focus is key");
	 }
}

public class LAunchAnno {

	public static void main(String[] args) {
		
		// lambeda Expression 
		Trail t = ()->{
			return 10;
		};

	}

}
