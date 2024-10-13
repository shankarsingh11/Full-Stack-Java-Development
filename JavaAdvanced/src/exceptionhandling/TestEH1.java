package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestEH1 {

	public static void main(String[] args)  {
		
		try(BufferedReader br = new BufferedReader(new FileReader("sample.txt")))
		{
		System.out.println("Hello try block");
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
