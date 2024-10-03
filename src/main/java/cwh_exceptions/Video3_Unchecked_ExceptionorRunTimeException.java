package cwh_exceptions;

public class Video3_Unchecked_ExceptionorRunTimeException {

	public static void main(String[] args) {
		/*
		 * If you are dividing a number by 0 then it will gives ArithmeticException 
		 * but in this case compiler could not be able to check this exception
		 * That's why its not giving any underline or some other error
		 * This exception you will get after running the program 
		 * So this is the perfect example of Run time exception
		 */
		int a=100;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
}
