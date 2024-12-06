package collection;

import java.util.*;

class Student 
{
	 private int age ;
	 private int marks;
	 private String name;
	 
	 public Student(int age,int marks,String name) 
	 {
		 this.age = age;
		 this.marks = marks;
		 this.name= name;
	 }
	 
	public int getAge() {
		return age;
	}
	public int getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}
	 
	 
}

public class LaunchGen {

	public static void main(String[] args) {
	
		Student s1 = new Student(15,75,"Deep");
		Student s2 = new Student(17,99,"sharmaji");
		Student s3 = new Student(16,80,"Rahul");
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
//		al1.add(100);
//		al1.add(200);
		
		System.out.println(al1);
		

	}

}
