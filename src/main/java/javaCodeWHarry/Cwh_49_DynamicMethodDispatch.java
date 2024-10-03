package javaCodeWHarry;

class Phone{
	public void call() {
		System.out.println("Calling ...");
	}
	
	public void ring() {
		System.out.println("Ringing ....");
	}
	
	public void time() {
		System.out.println("Time is 8 AM..");
	}
}
class Smartphone extends Phone{
	
	@Override
	public void call() {
		System.out.println("Calling from Smartphone...");
	}
	
	@Override
	public void ring() {
		System.out.println("Ringing in Smartphone....");
	}
	
	public void Browser() {
		System.out.println("Launching Chrome");
	}
	
	public void whatsApp() {
		System.out.println("Launching WhatsApp");
	}
}

public class Cwh_49_DynamicMethodDispatch {
	
public static void main(String[] args) {
//	Phone p= new Phone(); Allowed
//	Smartphone p = new Smartphone(); Allowed
//	p.call();
	
	Phone p= new Smartphone();  //Allowed //This is called runtime PolyMorphism
	
	p.call(); //Coming from Smartphone because its a overided method
	p.ring(); //Coming from Smartphone because its a overided method
	p.time(); //Coming from Phone 
//	p.whatsApp();  //Not Allowed because only overied method can be called from Child class 
	
//	Smartphone p= new Phone();  Not Allowed
}
}
