package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithoutResource {

	public static void main(String[] args) throws IOException {
		
		// not a good approach 
		// it close a resource forcefully in finally block
		BufferedReader br = null ;
		try {
			br = new BufferedReader(new FileReader("sample.txt"));
			System.out.println("BufferedReader");
		}catch(Exception e)
		{
		  System.out.println("Invalid file");
		  e.printStackTrace();
		}
		finally {
			// close resource
			br.close();
		}

	}

}
