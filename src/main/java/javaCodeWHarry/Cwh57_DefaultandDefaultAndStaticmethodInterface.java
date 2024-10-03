package javaCodeWHarry;


interface Camera{
	void takeSnap();
	void recordVideo();
	default void recordReel() {
		System.out.println("Recording reel");
	}
	
}

interface Wifi{
	
  String[] getNetworks();
  void connectToNetwork();
  
  static void greet(){
      System.out.println("Good Morning");
  }

  default void record4KVideo(){
      greet();
      System.out.println("Recording in 4k...");
  }
  
}


class Cellphone{
	public void dial(int n) {
		System.out.println("Dialing number :"+n);
	}
	public void recieveCall() {
		System.out.println("Recieve Call");
	}
}

class MySmartphone extends Cellphone implements Camera,Wifi{
	
//you need to implement all the method which is unimplemented 
	public void takeSnap() {
		System.out.println("Taking snap.....");
	}
	
	public String[] getNetworks() {
		String [] networks = {"KM708","KM703","KM709"};
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

public class Cwh57_DefaultandDefaultAndStaticmethodInterface {
	
	public static void main(String[] args) {
		
		MySmartphone oppo = new MySmartphone();
		oppo.recordReel();
		
		
	}

}
