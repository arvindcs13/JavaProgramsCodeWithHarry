package AbstractandINterfaceAndPolyMorphismandInhertitencepractice;

abstract class Pen{

	abstract public void penBody();
	abstract public void penColor();
	abstract public void penCap();
	 public void write() {
		 System.out.println("Writing with pen");
	};
}
class FountainPen extends Pen{
	

	@Override
	public void penBody() {
		System.out.println("I am the Pen body");
		
	}

	@Override
	public void penColor() {
		System.out.println("Blue Color");
		
	}

	@Override
	public void penCap() {
		System.out.println("Cap");
		
	}
    public void changeNib() {
    	System.out.println("Change By Nib");
    }
     
	
}

public class Pblm1 {
	
//	Create an abstract class pen with methods write () and refill () as abstract methods 
//	Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
	
public static void main(String[] args) {
//	Pen p = new FountainPen();
//	p.write();
//	p.penBody();
//	p.penCap();
//	p.penColor();
//	p.changeNib(); //will not work until you create the refrence of Fountainpen because this method only exists in Fountainpen
	
	FountainPen fp= new FountainPen();
	fp.changeNib();  
	fp.write(); //You can use this because it inherited the abstarct class pen
	
}
}
