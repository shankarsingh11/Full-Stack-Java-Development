package WrapperClass;

public class UtilityMethod {
    
	public static void main(String[] args) {
		
		
		
		// parseXXX ==> convert string to primitive type 
		System.out.println("ParseXXX Covert String to primitive type :");
		
		byte bt11 = Byte.parseByte("-123");
		System.out.println(bt11);
		
		short st = Short.parseShort("130");
		System.out.println(st);
		
		int i11 = Integer.parseInt("100");
		System.out.println(i11);
		
		long lg = Long.parseLong("16289");
		System.out.println(lg);
		
		float f11 = Float.parseFloat("36.34");
		System.out.println(f11);
		
		
		double dl = Double.parseDouble("12.342");
		System.out.println(dl);
		
		
	// Wrapper object =>primitive type(byte,short,int,long,float,double ) 
	// and Not applicable for character,boolean
		
		Integer i = new Integer(135);// primitive => wrapper object
		
		System.out.println("Wrapper object => primitive value");
		
		// xxxValue() => convet wrapper object to primitive type 
		
		// result => (mixrange + (total-maxrange-1))
		//            -128 + (135-127-1)=>  -121
		
		System.out.println(i.byteValue());// -121
		System.out.println(i.shortValue());// 135
		System.out.println(i.intValue());// 135
		System.out.println(i.longValue());// 135
		System.out.println(i.floatValue());// 135.0
		System.out.println(i.doubleValue());// 135.0
		
		Character c2 = new Character('a');
		System.out.println(c2.charValue());
		char ch = c2.charValue();
		System.out.println(ch);// a
		
		Boolean b = new Boolean(true);
		System.out.println(b.booleanValue());
		boolean bn = b.booleanValue();
		System.out.println(bn);
	
		
		// Number System
		// base-2(binary),base-8(Octal),base-10(decimal),base-16(Hexadecimal),base-36
		
		System.out.println("Min Base Range is : ");
		System.out.println("Min_Radix=> "+ Character.MIN_RADIX );
		System.out.println("Max Base Range is : ");
		System.out.println("Max_Radix=> " + Character.MAX_RADIX);
		
		Integer i4 =Integer.valueOf("100",2);// (primitive,String)=>Wrapper object
		System.out.println(i4);// 4
		
		// valueOf() => convert  String/primitive type to wrapper object
		System.out.println("valueOf() method : ");
		
		Integer i2 =Integer.valueOf("100",2);// (primitive,String)=>Wrapper object
		System.out.println(i2);// 4
		
		Float ft3 = Float.valueOf(12.4f);
		System.out.println(ft3);
		
		Float ft4 = Float.valueOf("10.34f");
		System.out.println(ft4);
		
		// String , primitive => wrapper object

		System.out.println("primctitive , String ==> Wrapper obje");
        Integer i12 = new Integer("12");
        System.out.println(i12);// 12(Wrapper Object)
        
        Integer i13 = new Integer(12);
        System.out.println(i13);// 12
        
		Boolean b1 = new Boolean(false);
		System.out.println(b1);// false
		Boolean b2 = new Boolean("false");
		System.out.println(b2);// false
		Boolean b3 = new Boolean("naveen");
		System.out.println(b1);// false
				
		Float ft1 = new Float(11.2);
		System.out.println(ft1);// 11.2
		
		Float ft2 = new Float(11.2);
		System.out.println(ft2);// 11.2

		//Integer i3 = new Integer("ten");
		//System.out.println(i3);// NumberFormatException
		
		Character c1 = Character.valueOf('A');// only value takes character 
		System.out.println(c1);
		
	}

}
