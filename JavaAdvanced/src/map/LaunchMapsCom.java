package map;
import java.util.*;
import java.util.Map.Entry;

class Student 
{
  private int age;
  private String name;
  private String city;
  
  public Student(String name,int age,String city)
  {
	  this.name= name;
	  this.age= age;
	  this.city=city;
	  
  }

public int getAge() {
	return age;
}

public String getName() {
	return name;
}

public String getCity() {
	return city;
}
 
@overide
public String toString()
{
	return  (name + " " + age + " " +  city  );
	
}

  
}

public class LaunchMapsCom {

	public static void main(String[] args) {
	
		Student s1 = new Student("Rahul",18,"Mumbai");
		Student s2 = new Student("Rohan",18,"Bangalore");
		Student s3 = new Student("Rohit",19,"Dehli");
		
		HashMap hm = new HashMap();
		
		hm.put(1, s1);
		hm.put(2, s2);
		hm.put(3, s3);
		
		System.out.println(hm);
		
		System.out.println("***KeySet*****");
		
		Set s = hm.keySet();
		Iterator itr1 = s.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("**value***");
		
		Collection c = hm.values();
		Iterator itr2 = c.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("**EntrySet**");
		Set st = hm.entrySet();
		Iterator itr3 = st.iterator();
		
		while(itr3.hasNext())
		{
			
		//	System.out.println(itr3.next());
			
			Map.Entry data = (Entry) itr3.next();
			System.out.println(data.getKey() + " : " + data.getValue());
		}
		
		
		
		
		
	}

}
