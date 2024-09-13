package WrapperClass;

import java.lang.Integer;
public class Test {

	public static void main(String[] args) {
	// Wrapper class => Integer	
		System.out.println("Integer Wrapper class:");
  Integer i1 = new Integer(10);//toString
  System.out.println(i1);
  Integer i2 = new Integer("10");//toString
  System.out.println(i2);
  
  Integer i3 = new Integer(10);//toString
  System.out.println(i3);
  
  Integer i4 = new Integer(20);//toString
  System.out.println(i4);
  
  System.out.println(i1.equals(i4));// false 
  
  System.out.println(i1.equals(i3));// true 
  
  System.out.println(i1.equals(i2));// true
  
 // Integer i3 = new Integer("Ten");
 // System.out.println(i3);//NumberFormatException.forInputString
	
//Wrapper class => Float
  
	System.out.println("Float Wrapper class:");

  Float f1  =  new Float(10.5f);
  Float f2  =  new Float("10.5f");
  Float f3  =  new Float("10.5");
  Float f4  =  new Float(10.5);
  
  System.out.println(f1);
  System.out.println(f2);
  System.out.println(f3);
  System.out.println(f4);
  

  //Wrapper class => Character
  System.out.println("Character Wrapper class :");
  Character c1 = new Character('a');
  System.out.println(c1);
  
//Wrapper class => Boolean
  // Type IS : boolean
  System.out.println("Boolean Wrapper Class :");
  Boolean b1 = new Boolean(true);
  System.out.println(b1);
  Boolean b2 = new Boolean(false);
  System.out.println(b2);
  
  // Not valid arguments 

//  Boolean b3 = new Boolean(True);
//  System.out.println(b3);
//  Boolean b4 = new Boolean(False);
//  System.out.println(b4);
//  Boolean b5 = new Boolean(TRUE);
//  System.out.println(b5);

  // String input => case a not important,content is not important
  // String input => case insensitive of true is treated as true 
  // other case treated as false 
  
  Boolean b6 = new Boolean("True");
  System.out.println(b6);// true
  Boolean b7 = new Boolean("False");
  System.out.println(b7);//false
  Boolean b8 = new Boolean("true");
  System.out.println(b8);// true
  Boolean b9 = new Boolean("false");
  System.out.println(b9);// false
  Boolean b10 = new Boolean("TRUE");
  System.out.println(b10);// true
  
  Boolean b11 = new Boolean("nitin");
  System.out.println(b11);// false 
  
  
  
	}

}
