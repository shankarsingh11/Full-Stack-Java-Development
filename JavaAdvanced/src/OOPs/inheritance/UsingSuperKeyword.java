package OOPs.inheritance;

class Demo101{
	 int age = 28;
}

class Demo102 extends Demo101{
	  int i = 10;
	  public int disp() {
		  
		  return super.age; // access a parent class instance variables 
	  }
	 
}

public class UsingSuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo102 dm  = new Demo102();
       System.out.println(dm.disp());
	}

}
