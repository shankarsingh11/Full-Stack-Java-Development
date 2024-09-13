package OOPs.interfaceconcepts;


interface ISample1
{
  void m1();	
}

interface ISample2
{
  void m1();	
}

class SampleImpl2 implements ISample1,ISample2
{
	public void m1(){}
	 
	
}
public class TestInterface {

	public static void main(String[] args) {
		
     SampleImpl2 sample = new SampleImpl2();
     
	}

}
