package functionalinterface;

/*
@FunctionalInterface
interface Demo2
{
 void add();

}
*/


/*
@FunctionalInterface
interface Demo2
{
 void add(int a,int b);

}

*/


@FunctionalInterface
interface Demo2
{
 int add(int a,int b);

}


public class LaunchLambda {

	public static void main(String[] args) {
		
		// Parameter type is Optional
		Demo2 d2 = (int n,int m) ->{ // right parameter
			int rs = n+m;
		 //System.out.println(rs); // 30
		    return rs;
		};
		
		
		/*
		Demo2 d2 = (n,m) ->{ //  right parameter
			int rs = n+m;
		 //System.out.println(rs); // 30
		    return rs;
		};
		
		*/
		
		
		//d2.add(10,20); 
		System.out.println(d2.add(10,20));// 30

	}

}
