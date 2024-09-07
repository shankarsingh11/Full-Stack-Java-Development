package OOPs.abstraction;

// Not 100% abstraction possible only possible in interface
abstract class Plane
{
	abstract public void takeOff();
	abstract public  void landing();
	abstract public void fly();
	
	public void airport()
	{
		System.out.println("All Plans need airport");
	}
}

class CargoPlane extends Plane
{
	public void takeOff()
	{
		System.out.println("CP  is need longer runway to takeOff");
	}
	public void fly()
	{
		System.out.println("CargoPlane is flying at lower height");
	}
	
	public void landing()
	{
		System.out.println("CP is  need longer runway to landing");
	}
}

class PassengerPlane extends Plane{
	
	public void takeOff()
	{
		System.out.println(" PP is  need medium runway to takeOff");
	}

	 
	public void fly()
	{
		System.out.println("PassengerPlane is flying at medium height");
	}
	public void landing()
	{
		System.out.println("PP is need medium runway to landing");
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

public class LaunchPlane2 {

	public static void main(String[] args) {
	    // tight coupling  
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		Airport a = new Airport();
		// pass a references 
		a.permit(cp);
		a.permit(pp);
	
	}

}
