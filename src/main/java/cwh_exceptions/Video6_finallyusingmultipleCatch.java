package cwh_exceptions;

public class Video6_finallyusingmultipleCatch {
	public static void main(String[] args) {

		try {
			int a = 100, b = 2 ,c = a / b;
			System.out.println(c);
			return;	

			
		} 
		catch (ArithmeticException e) {
			System.out.println(e);
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("I can use with multiple catch block \n"
					+ "also but finally block code cannot be multiple\n"
					+ "Even you used the jump statement linke return, break, continue then also I will get execute");
		}

	}
}
