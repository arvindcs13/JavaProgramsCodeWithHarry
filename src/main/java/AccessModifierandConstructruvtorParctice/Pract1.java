package AccessModifierandConstructruvtorParctice;
class Cylinder{
	private int radious;
	private int height;
	

	
	public int getRadious() {
		return this.radious;
	}
	
	public void setRadious(int i) {
		radious=i;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int i) {
		height=i;
	}
	
	public int volume() {
		return radious*height;
	}
	
	public int Surface() {
		return radious+height;
	}
	
	
}
public class Pract1 {
//	create a class cylinder and use getter and setters to set its radius and height 
	public static void main(String[] args) {
		Cylinder cy= new Cylinder();
		cy.setHeight(4);
		System.out.println("height of the cylinder is "+cy.getHeight());
		cy.setRadious(2);
		System.out.println("Radious of the cylinder is "+cy.getRadious());
		System.out.println("Volume of the cylinder is "+cy.volume());
		System.out.println("Surface arae of the cylinder is "+cy.Surface());
		
		
		
		
	}
}
