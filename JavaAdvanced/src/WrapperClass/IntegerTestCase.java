package WrapperClass;

public class IntegerTestCase {
	
	static Integer i3; // i3 = null

	public static void main(String[] args) {
		// case1
		
		// int i4 = i3; // int i4 = i3.intValue() ::NullPointerException
		//System.out.println(i4);// NullPointerException
	
		// case2
		Integer i1 = 10;
		Integer i2 = i1;
		i1++;
		System.out.println(i1);// 11
		System.out.println(i2);// 10
		System.out.println(i1==i2);// false
		
		// case 3
		
		Integer x = new Integer(10);
		Integer y = new Integer(10);
		System.out.println(x==y);// false
		
		// case 4
		
		Integer s = new Integer(10);
		Integer t = 10;
		System.out.println(s==t);// false
		
		// case 5
		Integer z = new Integer(10);
		Integer r = z;
		System.out.println(z==r);// true
		

	}

}
