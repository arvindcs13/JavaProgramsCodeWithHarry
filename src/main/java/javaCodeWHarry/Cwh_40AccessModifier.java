package javaCodeWHarry;

class Employ{
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int i) {
		id=i;
	}
	
	private String name;
	public String  getName() {
		return name ;
	}
	public void setName(String n) {
		name=n;
	}
	
	
}

public class Cwh_40AccessModifier {
  public static void main(String[] args) {
	
		Employ emp = new Employ();
//		emp.id=1234; it will show error because int has private access modifier
//		emp.name="Arvind"; it will show error because int has private access modifier 
//		Tp access privte element in another class we nee to use Getters and setters
		//now
		
		emp.setName("Arvind");
		emp.setId(1820647);
		//Now its time to print it 
		System.out.println(emp.getId());
		System.out.println(emp.getName());
}
}
