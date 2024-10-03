package cwh_exceptions;

public class Video1_Deepak_TryCatchBlock {
	
	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(100/0);  //in try block where the exception will come code after that will not be executed 
			System.out.println(4);
			System.out.println(5);
		}
		catch( ArithmeticException e) {
			System.out.println(6);   //direclty it will move to catch block
			System.out.println(7);
			System.out.println(e);
			System.out.println(8);
		}
		catch( Exception e) {            //if the exception is catched once it will not execute the next catch block statement
			System.out.println(9);  
			System.out.println(10);
			System.out.println(e);
			System.out.println(11);
		}
		
		System.out.println("Thank You");
		
		
	}

}
