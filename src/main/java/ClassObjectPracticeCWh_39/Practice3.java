package ClassObjectPracticeCWh_39;

class Square{
	int side;
	int area() {
		return side*side;
	}
	
	int perimeter() {
		return 4*side;
	}
	
	int kchbhi() {
		return 2*side;
	}
	
}
public class Practice3 {

	public static void main(String[] args) {
//		Create a class Square with a method to initialize its side, calculating area, perimeter etc.
		Square sq= new Square();
		sq.side=4; //Initializing the object here 
		System.out.println("The area of the square " +sq.area());
		System.out.println("The perimeter of the square " +sq.perimeter());
		System.out.println("The sides of the square " +sq.kchbhi());
		
		

	}

}
