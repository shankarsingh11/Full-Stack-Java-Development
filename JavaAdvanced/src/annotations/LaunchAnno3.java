package annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)

@interface FoodBallPlayer{
	
	String country() default "US";
	int goals() default 100;
}

@FoodBallPlayer
class Ronaldo{
	
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
public class LaunchAnno3 {

	public static void main(String[] args) {
		
		Ronaldo r1 = new Ronaldo();
		r1.setInnings(200);
		r1.setName("Ronaldo");
		
		System.out.println(r1.getInnings());
		System.out.println(r1.getName());
		
		Class c = r1.getClass();
		Annotation an = c.getAnnotation(FoodBallPlayer.class);
		FoodBallPlayer fp = (FoodBallPlayer) an;
		String s = fp.country();
		int g = fp.goals();
		System.out.println(s);
		System.out.println(g);

	}

}
