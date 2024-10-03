package cwh_exceptions;

import java.util.Scanner;

class YoungAgeException extends Exception
{
	public YoungAgeException(String msg){
		super(msg);
	}
}

public class Video7_ThrowKeyword {
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Abhinav age");
	int age =sc.nextInt();
	
	
	try {
		if(age<=18) {
			
			throw new YoungAgeException("You are not Eligible for voting !");
		
	}else
	{
		System.out.println("You are Eligible for voting !");
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
System.out.println(" Thank YOU!");	
System.out.println(" Thank YOU!");	
System.out.println(" Thank YOU!");	
System.out.println(" Thank YOU!");	
System.out.println(" Thank YOU!");	
System.out.println(" Thank YOU!");	
	
}
}
