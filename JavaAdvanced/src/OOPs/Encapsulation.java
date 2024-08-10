package OOPs;

class EncapStudent1{
	
	private String name;
	private int age;
	private String city;
	
	public  EncapStudent1(String name,int age,String city){
		this.name = name;
		this.age= age;
		this.city= city;
		 
	 }
    public  EncapStudent1(String name,String city){
    	
    	this.name = name;
    	this.city = city;
		 
	 }
    
    public EncapStudent1(String name) {
 
    	this.name = name;
    }
    
    public EncapStudent1(int age) {
    	
    	this("dheeraj",34,"dehli");
    	
    	this.age = age;
    	
    }
    
    public EncapStudent1(int age,String city) {
    	
    	this.age = age;
    	this.city= city;
    }
    
    public EncapStudent1() {
    	
    	this.name = "shankar";
    	this.age = 21;
    	this.city = "noida";
    	
    	
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
    
	 
	 
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		EncapStudent1 std1 = new EncapStudent1();
		EncapStudent1 std2 = new EncapStudent1("deepak",22,"haryana");
		EncapStudent1 std3 = new EncapStudent1("rohit","kanpur");
		EncapStudent1 std4 = new EncapStudent1("shubham");
		EncapStudent1 std5 = new EncapStudent1(25);
		EncapStudent1 std6 = new EncapStudent1(28,"bangalore");
		
		System.out.println(std1.getName() + " "+ std1.getAge()+" " + std1.getCity());// shankar 21 noida 
		
	    System.out.println(std2.getName() +" "+ std2.getAge() +" "+ std2.getCity());
	    System.out.println(std3.getName() +" "+ std3.getAge() +" "+ std3.getCity());
		System.out.println(std4.getName() +" "+ std4.getAge() +" "+ std4.getCity());
     	System.out.println(std5.getName() +" "+ std5.getAge() +" "+ std5.getCity());
		System.out.println(std6.getName() + " "+std6.getAge() + " "+std6.getCity());

	}

}
