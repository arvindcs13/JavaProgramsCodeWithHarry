package javaCodeWHarry;

 class Employee{
	 int id;
	 String name;
	 int salary;
	 
	 void getId() {
		 System.out.println("This id of emplyee is "+id);
	 }
	 void getName() {
		 System.out.println("This name of emplyee is "+name);
	 }
	 int  getSalary() {
		 return salary;
	 }
	 
	 
}

public class Cwh38_ClassCustom {
	
public static void main(String[] args) {
	Employee arvind= new Employee(); //Creating a new object from employee class
	arvind.id=1820647;
	arvind.name="Arvind Yadav";
	arvind.salary=89000;
	//calling the method of employee class
	arvind.getId();
	arvind.getName();
	System.out.println("The salary of Arvind is :"+arvind.getSalary());
	
	//Creating a new object manoj
	System.out.println("Info of Manoj");
	Employee manoj= new Employee();
	manoj.id=1820648;
	manoj.name="Manoj Tiwari";
	manoj.salary=125000;
	//calling a method for new object manoj;
	
	manoj.getId();
	manoj.getName();
	System.out.println("The salary of Arvind is :"+manoj.getSalary());
	
	
	
	
	
	
}
}
