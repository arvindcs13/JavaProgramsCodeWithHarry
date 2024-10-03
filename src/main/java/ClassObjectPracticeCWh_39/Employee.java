package ClassObjectPracticeCWh_39;

class Employeee{
	int id;
	String name;
	int salary;
	
	int getId() {
		return id;
	}
	
	int getSalary() {
		return salary;
	}
	
	void setSalary(int s) {
		salary=s;
	}
	
	String getName() {
		return name;
	}
	void setName(String st) {
		name=st;
	}
}

public class Employee {

	public static void main(String[] args) {
//		1st obj
		Employeee arvind=new Employeee();
		arvind.setName("Arvind Yadav");
		arvind.id=11;
		arvind.setSalary(110000);
	//2nd obj
		Employeee manoj=new Employeee();
		manoj.setName("Manoj"); //if we leave it blank then it will give output as null 
		manoj.id=12;
		manoj.setSalary(1100002);
		System.out.println("Manoj employee  id is : "+manoj.getId());
		System.out.println("Manoj employee name is : "+manoj.getName());
		System.out.println("Manoj employee name is : "+manoj.getSalary());
	//3rd object	
		
		Employeee tiwari= new Employeee();
		tiwari.setName("Tiwari"); //setting up the name 
		tiwari.id=13;
		tiwari.setSalary(110025);
		
		//Accessing the Methods;
		System.out.println("Arvind employee  id is : "+arvind.getId());
		System.out.println("Arvind employee name is : "+arvind.getName());
		System.out.println("Arvind employee salary is : "+arvind.getSalary());
		
		//like that we can access for other employeee
		
		
		
		

	}

}
