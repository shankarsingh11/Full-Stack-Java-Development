package OOPs.interfaceconcepts;


interface IRemote1
{
  int a =10;	
}
public class InterfaceVariableWithImpl  implements IRemote1{

	public static void main(String[] args) {
		
      System.out.println(a);
      System.out.println(IRemote1.a);
	}

}
