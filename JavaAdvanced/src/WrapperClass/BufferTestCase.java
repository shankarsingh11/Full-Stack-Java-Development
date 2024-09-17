package WrapperClass;

public class BufferTestCase {

	public static void main(String[] args) {
		
		//Buffer memory range for datatype(Byte,Short,Int,Long,Bool,Char) (-128 to 127)
		//if out of range then create new obj in new memory location 
		 
		
		Integer x= 128;
		Integer y = 128;
		System.out.println(x==y);// false
		
		Integer i1 = 127;
		Integer i2= 127;
		System.out.println(i1==i2);// true
		
		Integer i3 = 1000;
		Integer i4 = 1000;
		
		System.out.println(i3==i4);// false
		
		Boolean b1 = true;
		Boolean b2 = true;
		
		System.out.println(b1==b2);// true
		
		// Not buffer concepts
		
		Double d1 = 10.4;
		Double d2 = 10.4;
		System.out.println(d1==d2);// false
		
		Character c1= 'a';
		Character c2 = 'a';
		System.out.println(c1==c2);// true 
		
	}

}
