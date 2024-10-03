package AccessModifierandConstructruvtorParctice;

class Cylinder_pblm2{
	private int radious;
	private int height;
	

	public Cylinder_pblm2(int i,int j) {
		this.radious=i;
//		System.out.println("Radious of the Cylinder is :"+i);
		this.height=j;
//		System.out.println("Height of the Cylinder is :"+j);
	}
	
	public int getRadious() {
		return this.radious;
	}
	
//	public void setRadious(int i) {
//		radious=i;
//	}
	
	public int getHeight() {
		return this.height;
	}
	
//	public void setHeight(int i) {
//		height=i;
//	}
	
	public int volume() {
		return radious*height;
	}
	
	public int Surface() {
		return radious+height;
	}
	
	
}
public class Pract2 {
	public static void main(String[] args) {
		Cylinder_pblm2 cy= new Cylinder_pblm2(3,4);
		System.out.println("Radious of the Cylinder is :"+cy.getRadious());
		System.out.println("Height of the Cylinder is :"+cy.getHeight());
		System.out.println("Volume of the Cylinder is :"+cy.volume());
		System.out.println("Surface of the Cylinder is :"+cy.Surface());
		
	}
}
