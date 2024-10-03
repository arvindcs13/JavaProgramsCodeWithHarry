package javaCodeWHarry;

interface Bicycle{
	int a=45; //whatever property we decleare inside interface thats final 
	void speedup();
	void applyBreak(int a);
	
}
interface BicycleHorn{
	void bollywood() ;
	void hollywood();
	int tollywood();
	
}

class AvonBicylce implements Bicycle,BicycleHorn{

	//All the method which you implementing that should be have access modifier as public 
	public void bollywood() {
		System.out.println("....DDLJ...");
		
	}

	public void hollywood() {
	   System.out.println("............Taylor Swift.........");
		
	}

	public void speedup() {
		System.out.println("aaplying speed....");
		
	}

	public void applyBreak(int a) {
		System.out.println("Applying break....");
		
	}

	public int tollywood() {
		
		return 3;
	}
	
}

public class Cwh54_Interface {

	public static void main(String[] args) {
		
		AvonBicylce bi= new AvonBicylce();
//		bi.a=454;  //It will give error because property inside interface cannot be changed it decleared as a final;
		bi.speedup();
		bi.applyBreak(3);
		bi.bollywood();
		bi.hollywood(); 
		
		
		 
      
	}

}
