package Encap;

import java.util.*;

class Student{
	private int age;
	private String name;
	private String city;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

public class LaunchEncap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Student s = new Student();
		s.setAge(18);
		s.setName("shankar singh");
		s.setCity("noida");
		
		System.out.println(s.getAge() + " " + s.getName() + " " + s.getCity());
		
	}

}
