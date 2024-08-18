package OOPs.inheritance;

import java.util.*;

class Interest{
	
	void input() {
		Scanner sc = new Scanner(System.in);
		
	}
	
	    	
}

class InterestPersonalLoan extends Interest{
	
	
	
}

class InterestEducationLoan extends Interest{
	  
	
}

class InterestGoldLoan extends Interest{
	
}

class InterestHomeLoan extends Interest{
	
}

class InterestAgricultureLoan extends Interest{
	
}

class InterestBusinessLoan extends Interest{
	
}

class InterestMedicalLoan extends Interest{

	
}

class EducationLoan extends Loan{
	
	private static float ri;
	static {
		ri = 9;
	}
       
	public InterestEducationLoan interest() {
		InterestEducationLoan el = new InterestEducationLoan();
		return el;
		}
}

class GoldLoan extends Loan{
	
	private static float ri;
	static {
		ri = 14;
	}
	
	public InterestGoldLoan interest() {
		InterestGoldLoan gl = new InterestGoldLoan();
		return gl;
		}
}

class BusinessLoan extends Loan{
	
	private static float ri;
	
	static {
		ri = 18;
	}
	
	public InterestBusinessLoan interest() {
		InterestBusinessLoan bl = new InterestBusinessLoan();
		return bl;
		}
	
}

class HomeLoan extends Loan{
	
	private static float ri;
	static {
		ri = 12;
	}
	
	public InterestHomeLoan interest() {
		InterestHomeLoan hl = new InterestHomeLoan();
		return hl;
		}
	
}

class AgricultureLoan extends Loan{
	
	private static float ri;
	
	static {
		 ri = 4;
	}
	
	public InterestAgricultureLoan interest() {
		InterestAgricultureLoan al = new InterestAgricultureLoan();
		return al;
		}
	
}

class MedicalLoan extends Loan{
	
	public InterestMedicalLoan interest() {
		InterestMedicalLoan ml = new InterestMedicalLoan();
		return ml;
		}
	
}

class PersonalLoan extends Loan{
	
	public InterestPersonalLoan interest() {
		InterestPersonalLoan ip = new InterestPersonalLoan();
		return ip;
	}
}

class Loan{
	
	public float pa;
    public  float td;
    public int si;
	
	 public Interest interest() {	 
	 Interest it = new Interest();
	 return it;
	}
	 
	 void input() {
		 System.out.println("Kindly Enter the principal amount");
		 Scanner sc = new Scanner(System.in);
		 int pa = sc.nextInt();
		 Loan l = new Loan();
		 
	 }
}



public class LoanApplication {

	public static void main(String[] args) {
	
		System.out.println("Welcome to the Loan Application");
		PersonalLoan pl = new PersonalLoan();
		  pl.interest();
		

	}

}
