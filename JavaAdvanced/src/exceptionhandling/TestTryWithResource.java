package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestTryWithResource {

	public static void main(String[] args)  {
		
		try( final  BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
			 // br = new BufferedReader(new FileReader("output.txt")); // CE : can not reassign  
		}catch(FileNotFoundException fnfe)
		{
			System.out.println("Invalid file location");
		}catch(IOException ioe) {
			System.out.println("IO invalid ");
		}
	}

}
