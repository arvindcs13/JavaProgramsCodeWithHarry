package cwh_exceptions;

public class Video6_CaseswhenfinallyblockdonotExecute2 {

	public static void main(String[] args) {
		try {
			int a = 100, b = 2 ,c = a / b;
			System.out.println(c);
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
			int a = 100, b = 0 ,c = a / b;
			System.out.println(c);
			System.out.println("I will not execute because there is exception in my block");
		}

	}

}
