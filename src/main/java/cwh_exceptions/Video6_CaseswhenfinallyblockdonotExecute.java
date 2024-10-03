package cwh_exceptions;

public class Video6_CaseswhenfinallyblockdonotExecute {
	
	public static void main(String[] args) {
		try {
			int a = 100, b = 2 ,c = a / b;
			System.out.println(c);
			System.exit(0);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
			System.out.println("I will not execute because you used System.exit(0) method");
		}
	}

}
