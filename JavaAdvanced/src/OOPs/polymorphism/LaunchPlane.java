package OOPs.polymorphism;

class Plane
{
	public void takeOff()
	{
		System.out.println("Plane is taking off");
	}
	
	public  void landing()
	{
		 System.out.println("Plane is landing ");
	}
	
	public void fly()
	{
		System.out.println("Plane if flying");
	}
}

class CargoPlane extends Plane
{
	public void fly()
	{
		System.out.println("CargoPlane is flying at lower height");
	}
}

class PassengerPlane extends Plane{
	 
	public void fly()
	{
		System.out.println("PassengerPlane is flying at medium height");
	}
}

class FighterPlane extends Plane
{
	public void fly()
	{
		System.out.println("FighterPlane is flying at high height");
	}
}

class Airport
{
	public void permit(Plane plane) // Plane type reference variable 
	{  // runtime polymorphism 
		
	   plane.takeOff();
	   plane.landing();
       plane.fly();
	}
}

public class LaunchPlane {

	public static void main(String[] args) {
	    // tight coupling  
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Airport a = new Airport();
		// pass a references 
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
	}

}
