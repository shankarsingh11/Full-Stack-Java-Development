package exceptionhandling;

public class ExcepExm8 {
	
	public static void disp()
	{
		try
		{
			System.out.println("Inside Outer try");
			try
			{
				System.out.println("Inside Inner try");
				System.out.println(10/0);
			}
			catch (ArithmeticException e)
			{
				System.out.println("Inside inner catch");
			}
			System.out.println("Outside inner try-catch");
		}
		catch(Exception e)
		{
			System.out.println("Inside Outer catch");
		}
		finally
		{
			System.out.println("Inside Outer finally");
		}
		
	}

	public static void main(String[] args) {
		
		disp();

	}

}
