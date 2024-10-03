package javaCodeWHarry;

interface MyCamera1 {
	void takeSnap();

	void recordVideo();

	default void recordReel() {
		System.out.println("Recording reel");
	}

	static void camreaStatic() {
		System.out.println("I am a static method");
	}
}

interface MyWifi1 {

	String[] getNetworks();

	void connectToNetwork();

	default void connectVPN() {

		System.out.println("Recording in 4k...");
	}

}

class MyCellphone {
	public void dial(int n) {
		System.out.println("Dialing number :" + n);
	}

	public void recieveCall() {
		System.out.println("Recieve Call");
	}
}

class MySmartphone1 extends MyCellphone implements MyCamera1, MyWifi1 {

//you need to implement all the method which
	public void takeSnap() {
		System.out.println("Taking snap.....");
	}

	public String[] getNetworks() {
		String[] networks = { "KM708", "KM703", "KM709" };
		return networks;
	}

	public void recordVideo() {
		System.out.println("Recording started....");
	}

	public void connectToNetwork() {
		System.out.println("Connecting to network.....");
	}

	public void recordReel() {
		System.out.println("Recording reel for insta");
	}

}

public class Cwh59_PolymorphismInInerfaces {
       public static void main(String[] args) {
    	   
    	   MyCamera1 cm = new MySmartphone1(); 
    	 //you can use the Smartphone as a camera use can use all the method available in MYcamarae interface only 
    	   cm.recordVideo();
    	   cm.takeSnap();
    	   cm.recordReel(); //Note this one is not avaiable in Mysmartophone class but due tro the reference we call it
//    	   cm.camreaStatic(); //not allowed as this static method it can you inside same class/interface
//    	   cm.recieveCall(); //you cannolt use it as this is coming from Cellphone class
    	   
    	   MySmartphone1 oppo= new MySmartphone1();  
    	   //by this you can call the method which are available in 
//    	   Smartphone class as well as the class cellphone because of inheritence
    	   oppo.connectToNetwork();
    	 
    	   
    	   
	}
}
