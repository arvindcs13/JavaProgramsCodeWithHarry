package javaCodeWHarry;

class Cwh{
	 int x;
	public int getX() {
		return x;
	}
	
	public Cwh(int x) {
//		x=x;         //It will return 0 because the compiler failed to differenciate in between  attribute int x and variable int x that we are passing from the constructor 
//	these types of 	situation can be handeled by this Keyword 
		this.x=x;
	}
	
}

public class Cwh47_thisKeyword {

	public static void main(String[] args) {
		Cwh c= new Cwh(65);
		System.out.println(c.getX()); //

	}

}
