package annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// custom(User defined) Annotation

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)


@interface CricketPlayer
{
   //@--> its not interface but its Annotation being created 
    
	
	String country() default "India";
	int runs() default 2000;
	
//	String country();
//	int runs();

}

// Target
// retention policy


//@CricketPlayer(country = "India", runs=200)

@CricketPlayer
class ViratKohli
{
	  private int innings;
	  private String name;
	  
	public int getInnings() {
		return innings;
	}
	
	public void setInnings(int innings) {
		this.innings = innings;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	  
	  
}


public class LaunchAnno2 {

	public static void main(String[] args) {
	
	ViratKohli vk = new ViratKohli();
	
	vk.setInnings(100);
	vk.setName("vk");
	
	System.out.println(vk.getInnings());
	System.out.println(vk.getName());
	
	  Class c = vk.getClass();
	  Annotation an = c.getAnnotation(CricketPlayer.class);
	  CricketPlayer cp = (CricketPlayer) an;
	  String name =cp.country();
	  int run = cp.runs();
	  
	  System.out.println(name);
	  System.out.println(run);
	
		
	}

}
