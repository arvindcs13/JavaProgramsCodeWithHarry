package ClassObjectPracticeCWh_39;

class Rectangle{
	int side1;
	int side2;
	
	void checkShape() {
		if(side1==side2) {
			System.out.println("This is a not a rectangle");
		}
		else {
			System.out.println("This is  a rectangle");
		}
	}
	
	int areaRec() {
		return side1*side2;
	}
	
	int perimeterRec() {
		return 2*(side1+side2);
	}
	
	
}

public class Practice4 {

	public static void main(String[] args) {
		Rectangle rc =new Rectangle();
		rc.side1=2;
		rc.side2=4;
		rc.checkShape();
		System.out.println("Reactangle area is "+rc.areaRec());
		System.out.println("Reactangle perimeter is "+rc.perimeterRec());
		
		
		
	}

}
