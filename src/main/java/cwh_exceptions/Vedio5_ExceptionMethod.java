package cwh_exceptions;

public class Vedio5_ExceptionMethod {
public static void main(String[] args) {
	
	int a=100;
	int b=0;
	try {
		int c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e) {
		e.printStackTrace(); //name of the exception + description + stacktrace means the line at which we are getting the exception
//		System.out.println(e); //name of the exception + description
//		System.out.println(e.toString()); //name of the exception + description
		System.out.println(e.getMessage()); // description only
	}
	
	System.out.println("Thank YOU !");
}
}
