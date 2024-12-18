package enums;

enum Result
{
	 PASS , FAIL , NR;
	
	// PASS --> public static final Result PASS = new Result();
	// FAIL --> public static final Result FAIL = new Result();
	// NR   --> public static final Result NR   = new Result();
	
	Result(){
		System.out.println("Constructor is called");
	}
	
}

public class LaunchEnums2 {
	
	public static void main(String[] args) {
		
		Result res=Result.PASS;
		System.out.println(res);
		
		Result[] resArr = Result.FAIL.values();
		
		for(Result shankar : resArr) {
			System.out.println(shankar.ordinal() + " : " + shankar.name());
		}

	}

}
