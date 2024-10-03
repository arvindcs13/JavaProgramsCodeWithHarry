package javaCodeWHarry;

class Member{
	//Constructor 1
	String name;
	int id;
	public Member() {
		System.out.println("This is a Member class");
	}
	
	//Constructor 2
	public Member(String n, int i) {
		this.name=n;
		this.id=i;
	}
	
	public String getMember() {
		return this.name;
	}
	public int getMemberID() {
		return this.id;
	}
	
	//Constructor 3
	public Member(String name,int id,int profit) {
		System.out.println("Member name is :"+name);
		System.out.println("Member id is :"+id);
		System.out.println("Member profit is :"+profit);
	}
	
}

public class Cwh_42Constructor {
    public static void main(String[] args) {
    	System.out.println("Calling constructor 1");  //No Argument Constructor
    	Member m=new Member();
    	
    	System.out.println("Calling constructor 2"); //paraemeterized constructor 
    	Member m2= new Member("Arvind",23);
    	System.out.println("The name object which is creatred is :"+m2.getMember());
    	System.out.println("The id object which is creatred is :"+m2.getMemberID());
    	
    	
    	System.out.println("Calling constructor 3"); //Constructor Overloading
    	Member m3= new Member("Mohan",45,1000);
	}
}
