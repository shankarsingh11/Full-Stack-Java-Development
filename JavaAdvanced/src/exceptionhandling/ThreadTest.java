package exceptionhandling;

import java.io.*;
     
public class ThreadTest{
    
	public static void main(String[] args) {
		
		String s = new String("shankar");
		System.out.println(s );
		
		Object t3 = new String("Ashok");
		
		System.out.println(t3 instanceof String);// true
		System.out.println(null instanceof String);//false 
		
		/*
		Object t2 = new Object();
		System.out.println(t2 instanceof Object);//true
		System.out.println(t2 instanceof Thread);// false
		System.out.println(t2 instanceof Runnable);// false
	    System.out.println(t2 instanceof String);// false
	    System.out.println(null instanceof Object);// false
	 
	 */
	 
	  /*  
		Object t1 = new Thread();
		
		//Thread t = new Object(); // cannot convert from Object to Thread
		
		System.out.println(t1 instanceof Object);//true
		System.out.println(t1 instanceof Thread);// true
		System.out.println(t1 instanceof Runnable);// true
	    System.out.println(t1 instanceof String);// false
	    System.out.println(t1 instanceof null);// false
	*/
		
	/*	
		Thread t = new Thread();
		System.out.println(t instanceof Object);//true
		System.out.println(t instanceof Thread);// true
		System.out.println(t instanceof Runnable);// true
	//  System.out.println(t instanceof String);// CE //Unresolved compilation problem

	*/
		
		
	}

}
