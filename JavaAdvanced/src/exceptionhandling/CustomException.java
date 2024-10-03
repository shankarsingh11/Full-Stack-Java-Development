package exceptionhandling;

import java.util.Scanner;


class InvalidCustomerException extends Exception
{
	public InvalidCustomerException(String msg)
	{
		super(msg);
	}

}

class ATM
{
	int userid = 1212;
	int password = 1234;
	int uid;
	int pwd;
	
	public  void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly enter the userid ");
		 uid = sc.nextInt();
		System.out.println("Kindly enter the password ");
		 pwd = sc.nextInt();
	}
	
	public void verify() throws InvalidCustomerException
	{
		if((userid == uid) && (password == pwd))
		{
			System.out.println("Take your cash ");
		}else
		{
			InvalidCustomerException ice = new InvalidCustomerException("Are you sure ? Try again bcz wrong input ");
			//System.out.println(ice);
			System.out.println(ice.getMessage());
			throw ice;
		}
	}

}


class Bank
{
	 public void initiate()
	 {
		 ATM a = new ATM();
		 
		 try {
		    a.input();
			a.verify();
		} catch (InvalidCustomerException e1) {
			try {
			    a.input();
				a.verify();
			} catch (InvalidCustomerException e2) {
				try {
				    a.input();
					a.verify();
				} catch (InvalidCustomerException e3) {
					System.out.println("Oh Choor dude we caught you card is blocked! ");
					System.exit(0);
					
				}
			}
		}
	 }

}

public class CustomException { // user define exception
	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.initiate();

	}

}
