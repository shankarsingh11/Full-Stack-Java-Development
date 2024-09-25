package exceptionhandling;

import java.util.Scanner;

//UncheckedException ==> Compiler will not force us to checked
//CheckedException ==>It will be checked by compiler 

public class ExcepExm5 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		  System.out.println("Before Sleepn");
		  Thread.sleep(4000);
		  System.out.println("After sleepn");
		
	}

}
