package enums;

enum Course
{
   JAVA , JEE , SPRINGBOOT;
	
	int courseId;
	
	Course()
	{
		System.out.println("Constructor");
	}
	
	void setcourseId(int courseId)
	{
		this.courseId= courseId;
	}
	
	int getcourseId()
	{
		return courseId;
	}


}

public class LaunchEnum3 {

	public static void main(String[] args) {
		
		
	Course.JAVA.setcourseId(10);
	int cid = Course.JAVA.getcourseId();
	System.out.println(cid);
	
	Course.JEE.setcourseId(20);
	int cid2 = Course.JEE.getcourseId();
	System.out.println(cid2);
		
		
		
		
		
		
	}

}
