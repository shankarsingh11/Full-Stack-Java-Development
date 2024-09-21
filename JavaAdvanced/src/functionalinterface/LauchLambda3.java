package functionalinterface;

// WAP to Compute length of String

@FunctionalInterface
interface CLS
{
   int getLength(String str);	
}

// 1approach

//class LOS
//{
//  public int getLength(String str) {
//	  int rs = str.length();
//	  return rs;
//  }	
//}

public class LauchLambda3 {

	public static void main(String[] args) {
			
   //1approach
   //LOS cls = 	new LOS();
   // System.out.println(cls.getLength("ineuron ai"));//10
	
  // 2Approach
		
//	CLS cls = new CLS() {
//		
//		public int getLength(String str) {
//			return str.length();
//		}
//	};
//	
//	System.out.println(cls.getLength("ineuron ai"));//10
	
		
      // 3Approach
		
		CLS cls = str->str.length();
		System.out.println(cls.getLength("ineuron ai"));
	}
}
