package DemoMethod;


// Method OverLoading
// refers to process of writing more than one method  with same name and different parameters  
// compile time polymorphism
// compiler resolve a conflict 
// a) number of parameter b) datatype of parameter c) order of datatypes parameter

public class Calculator1 {
		

	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	
	float add(int a,float b) {
		return a+b;
	}
	
	float add(float a,float b) {
		return a+b;
	}
	
	double add(double a,float b) {
		return a+b;
	}
	
	double add(double a,double b,double c) {
		return a+b+c;
	}
	double  add(double a,float b,int c) {
		return a+b+c;
	}
}
