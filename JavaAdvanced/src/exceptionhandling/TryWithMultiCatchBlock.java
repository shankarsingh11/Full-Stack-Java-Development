package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithMultiCatchBlock {

	public static void main(String[] args) {
		
		try
		{
			
			int a = 10/0;
			System.out.println(a);
			new BufferedReader(new FileReader("sample.txt"));
			Class.forName(args[0]);
			
		}catch(ArithmeticException | IOException | NullPointerException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
