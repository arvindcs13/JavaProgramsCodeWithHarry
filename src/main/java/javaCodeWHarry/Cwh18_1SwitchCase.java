package javaCodeWHarry;
import java.util.*;

public class Cwh18_1SwitchCase {
	
	public static void main(String[] args) {
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age :");
		age= sc.nextInt();
		switch(age){
			case 19:
				System.out.println("Your a adult now !");
				break;
				
			case 23:
			System.out.println("Get a job !");
			break;
			
			case 28:
			System.out.println("Get married !");
			break;
			
			default:
				System.out.println("Live your life !");
		
			
		}
	}

}
