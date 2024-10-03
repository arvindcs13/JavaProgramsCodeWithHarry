package InheritencePractice;


class Circle{
	int r;
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Circle(int r) {
		this.r=r;
		System.out.println("This is a circle of radious :"+r);
	}
	
	public void getRadious() {
		System.out.println("Radious of the circle :"+r);
	}
	
	public double areaOfCircle() {
		return Math.PI*r*r;
	}
	
	public double circumFerenceofCircle() {
		return 2*Math.PI*r;
	}
	
}
class Cylinder extends Circle{
	int h;
	public Cylinder(int r,int h) {
		super(r);
		this.h=h;
		System.out.println("This is a Cylinder of height :"+h);
	}
	
	public void getHeight() {
		System.out.println("Height of the cylinder :"+h);
	}
	
	 public double volumeofCylinder(){
	        return Math.PI*r*r*h;
	    }

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	 
}
public class Cwh_Pract1 {
  public static void main(String[] args) {
	
	  Cylinder c= new Cylinder(4,5);
	  c.getRadious();
	  c.getHeight();
	 System.out.println( "Circumfernce if Circle is"+c.circumFerenceofCircle());
	 System.out.println("Area of circle is "+c.areaOfCircle());
	 System.out.println("Volume of Cylinder"+c.volumeofCylinder());
	  
}
}
