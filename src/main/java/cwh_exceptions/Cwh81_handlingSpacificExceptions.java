package cwh_exceptions;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Cwh81_handlingSpacificExceptions {
	
public static void main(String[] args) {
	
	int[] arr= {34,56,78,90,25};
	
	


	
	//In this we are handling specific exception
	try {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the index :");
		int index=sc.nextInt();
		int number;
		System.out.println("Enter the number :");
		number=sc.nextInt();
		System.out.println("The number you want to divide with is "+number);
		System.out.println("the result of array_index/number is :"+arr[index]/number);
	}
	catch(ArithmeticException e) {
		System.out.println("You Cannot divide the number with 0"+e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		int indexbound=arr.length-1;
		System.out.println("You can only enter the index upto "+indexbound);
		System.out.println("Error Occured is :"+e);
	}
catch(InputMismatchException e) {
		
		System.out.println("You can only enter integer as input");
		System.out.println("Error Occured is :"+e);
	}
	catch(Exception e) {
		System.out.println("Some Ither exception occured"+e);
	}
}
}
