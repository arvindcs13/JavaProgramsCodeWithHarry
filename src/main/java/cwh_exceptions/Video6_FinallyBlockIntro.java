package cwh_exceptions;

public class Video6_FinallyBlockIntro {

	public static void main(String[] args) {
		
		try {
			int a =100, b=0,c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("I will exectue any how, I am finally block");
		}
		System.out.println("Thank YOu !");
	}
}
