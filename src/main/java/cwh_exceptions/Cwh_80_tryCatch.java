package cwh_exceptions;



public class Cwh_80_tryCatch {
public static void main(String[] args) {
	
	int a =6000;
	int b =0;
	try {
		int c= a/b;
		System.out.println("The result is :"+c);
	}
	catch(Exception e) {
		System.out.println("Can't divide reason :"+e);
		
	}
	System.out.println("End of the program");
}
}
