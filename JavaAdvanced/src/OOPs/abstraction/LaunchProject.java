package OOPs.abstraction;

import java.util.*;

abstract class Shapes
{
   float area;
   abstract public void input();
   abstract public void compute();
   public void disp()
	{
		System.out.println("The area is :" + area);
	}
   
}

class Rectangle extends Shapes
{
	float length;
	float breadth;
	
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of rectangle");
		length = sc.nextFloat();
		System.out.println("Please enter the breadth of rectangle");
		breadth = sc.nextFloat();
	}
	
	public void compute()
	{
		area =length*breadth;
	}
		
}


class Square extends Shapes
{
	float length;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of square");
		length = sc.nextFloat();
		
	}
	
	public void compute()
	{
		area = length*length;
	}
	
}


class Circle extends Shapes
{
	float redius;
	final float pi = 3.14f;
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the redius of circle");
		redius = sc.nextFloat();
		
	}
	
	public void compute()
	{
		area = pi*redius*redius;
	}
	
}

class Eclipse extends Shapes
{   
	float height;
     float redius;	
   	final float pi = 3.14f;
   	
   	public void input()
   	{
   		Scanner sc = new Scanner(System.in);
   		System.out.println("Please enter the height of eclipse");
   		height = sc.nextFloat();
   		System.out.println("Please enter the redius of eclipse");
   		redius = sc.nextFloat();
   		
   	}
   	
   	public void compute()
   	{
   		area = pi*height*redius;
   	}
   	
}

class Geometry
{
	public void permit(Shapes s)
	{
		s.input();
		s.compute();
		s.disp();
	}
}


public class LaunchProject {

	public static void main(String[] args) {
	
		Rectangle r = new Rectangle();
		Square s  = new Square();
		Circle c = new Circle();
		Eclipse e = new Eclipse();
		Geometry g = new Geometry();
		
		g.permit(r);
		g.permit(s);
		g.permit(c);
		g.permit(e);

	}

}
