package OOPs.inheritance;

class Parentt{
	
   	int a,b;
	
	Parentt()
	{   
		a=10;
		b=20;
		System.out.println("Parentt Constructor");
	}
	
	Parentt(int a,int b)
	{
		this.a = a;
		this.b= b;
		System.out.println("Parentt para constructor");
	}
}

class Childd extends Parentt
{
     int x,y;
     
     Childd()
     {   
    	 this(102,103);
    	 x= 100;
    	 y= 200;
     }
     
     Childd(int x,int y)
     {   
    	 super(x,y);
    	 this.x=x;
    	 this.y = y;
     }
     
     void disp() {
    	 
    	 System.out.println(a);
    	 System.out.println(b);
    	 System.out.println(x);
    	 System.out.println(y);
     }
}

public class LaunchConstructor {

	public static void main(String[] args) {
        Childd ch = new Childd();
        ch.disp();
		//Childd ch2 = new Childd(500,1000);
		//ch2.disp();

	}

}
