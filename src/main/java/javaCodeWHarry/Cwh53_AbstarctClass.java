package javaCodeWHarry;

abstract class Phone1{
	abstract public void switchOn();
	abstract public void switchoff();
	public void showNetwork() {
		System.out.println("Full Network...");
	}
	abstract public void homePage() ;
	
}
 class Myphone extends Phone1{
// if we are inheriting the abstract class Then we need to recreate the abstract method which are available in the parent class 
	@Override
	public void switchOn() {
		System.out.println(" MyPhone Oppoo Switiching on...");
		
	}

	@Override
	public void switchoff() {
		System.out.println(" MyPhone Oppoo Switiching off...");
		
	}

	@Override
	public void homePage() {
		System.out.println(" MyPhone Oppoo HomePage...");
		
	}
	 
	public void Login() {
		System.out.println("Loggingn In ....");
	}
 }
 
public class Cwh53_AbstarctClass {

	public static void main(String[] args) {
		
//  you caanot create and object of AbstRACT CLASS
//		Phone P = new Phone();  -------it will give error 
//		Myphone m= new Phone(); -------it will also give error 
		
//		but you can take a refrence of the abstract class to create an object 
	Phone1 p= new Myphone(); //Allowed
	p.switchoff();   //follow dynamic method dispatch rule
	
	Myphone  p1= new Myphone(); //Allowed
	p1.switchOn(); //follow dynamic method dispatch rule 
		
	}

}
