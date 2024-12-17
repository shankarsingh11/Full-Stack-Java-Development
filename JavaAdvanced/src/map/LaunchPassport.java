package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Information
{
  private String name;
  private int age;
  private String fatherName;
  private String city;
  
public Information(String name, int age, String fatherName, String city) {
	super();
	this.name = name;
	this.age = age;
	this.fatherName = fatherName;
	this.city = city;
}

public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public String getFatherName() {
	return fatherName;
}

public String getCity() {
	return city;
}


public String toString()
{
  return name + " " + age + " " + fatherName + " " + city;	
}
  
  


}

//
//class Key {
//	
//	int key;
//	public Key(int key)
//	{
//		this.key = key;
//	}
//}

public class LaunchPassport {

	public static void main(String[] args) {
		
		//Map hm = new HashMap();
		//jdk 1.2
		// order of insertion is not preserved
		
		Information info1 = new Information("Rohan Sharma",18,"Sharmaji","Noida");
		
		Information info2 = new Information("Rohit Sharma",18,"Deepakji","Dehli");
		
		Information info3 = new Information("Rahul Sharma",18,"Raguvanshji","Mumbai");
		
		// Key k = new Key(123);
		
		HashMap hm = new HashMap();
		
		hm.put(123, info1);// Entry
		hm.put(124, info2);
		hm.put(125, info3);
		
		System.out.println("Welcome to Passport details App");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the passport Number");
		Integer k = scan.nextInt();
		boolean flag = false;
		
		Set s =  hm.entrySet();
		
		Iterator itr1 = s.iterator();
		
		while(itr1.hasNext())
		{
			Map.Entry passport = (Entry) itr1.next();
			Integer key = (Integer) passport.getKey();
			if(k==key)
			{
				System.out.println(" : info : " + passport.getValue());
				flag = true;
				//break;
				//System.exit(0);
			}
			
		}  
		
		if(flag==false) {
		 System.out.println("Passport number not found");
		} 
		
	}

}
