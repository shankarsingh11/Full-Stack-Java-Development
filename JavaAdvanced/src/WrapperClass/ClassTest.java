package WrapperClass;

class Student
{
   static
   {
	   System.out.println("Student .class file is loading");
   }
   
   public Student() {
	   System.out.println("Student Constructor is called");
   }
   
}
public class ClassTest {
	
	 static 
	 {
		 System.out.println("ClassTest.class file is loading by jvm becoz java ClassTest ");
	 }

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// object created
		//Student s = new Student();
		
		// Take the input of the className for which object has to be created at the rumtime
		String className = args[0];
		// load the class file explicitly
		Class c = Class.forName(className);
		
		// for the loaded class objectis created using zero paramiter constructer only
		Object obj = c.newInstance();
		
		// perform type casting to get student Object 
		Student std = (Student)obj; // Student <== String(No relationship so ClassCastException)
		System.out.println(std);
	}

}
