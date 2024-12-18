 package OOPs.interfaceconcepts;
 
 interface Shankar
 {
	 void teaches();//public abstract void teaches()
	 void writeCode();// public abstract void writecode()
	 
	 // java 8
	 // override is optional and implements in implementing class
	 default void disp()
	 {
		 System.out.println("normal method allowed");
		 disp3();
	 }
	 
	 // java 8
	 static void disp2()
	 {
		 System.out.println("Interface special method");
		 disp4();
	 }
	
	 // java 9
	 // not inheritate in other class 
	 private void disp3()
	 {
		 System.out.println("Interface private method");
	 }
	 
	 private static void disp4()
	 {
		 System.out.println("Interface private static method");
	 }

 }
 
 class Student implements Shankar{
	 
	 public void teaches() {
		 System.out.println("shanka teaches");
	 }
	 
	 public void writeCode() {
		 System.out.println("shankar write a code");
	 }
	 
//	 public void disp() {
//		 System.out.println("I can override in implementing class");
//	 }
	 
 }

public class LaunchJavaSpecial {

	public static void main(String[] args) {
		
    Student s1 = new Student();
    
    s1.teaches();
    s1.writeCode();
    s1.disp();
    
    
    Shankar.disp2();
		
		
		
		
		
	}

}
