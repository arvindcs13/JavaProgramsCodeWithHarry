package javaCodeWHarry;

public class Cwh_17_LogicalOprator {

	public static void main(String[] args) {
		boolean a = true;
		boolean b=false;
		
		System.out.println("Logical And !.....");
		if(a && b) {
			System.out.println("Yea !");
		}
		else {
			System.out.println("Nope !");
		}
		
		System.out.println("Logical Or !.....");
		if(a || b) {
			System.out.println("Yea !");
		}
		else {
			System.out.println("Nope !");
		}
		
		System.out.println("Logical Not.... "); //use to negate all the condition true become false and vice versa
		System.out.print("Not(a) is ");
        System.out.println(!a);
		
        System.out.print("Not(b) is ");
        System.out.println(!b);
	}
	
}
