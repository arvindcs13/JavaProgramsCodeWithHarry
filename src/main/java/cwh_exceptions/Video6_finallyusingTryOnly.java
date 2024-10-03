package cwh_exceptions;

public class Video6_finallyusingTryOnly {

	public static void main(String[] args) {
		try {
			int a =100, b=0,c=a/b;
			System.out.println(c);
		}
		finally{
			System.out.println(" I can execute with try block only");
		}

	}

}


/* Output:
 * I can execute with try block only
   Exception in thread "main" java.lang.ArithmeticException: / by zero
	at cwh_exceptions.Video6_finallyusingTryOnly.main(Video6_finallyusingTryOnly.java:7)
 */

