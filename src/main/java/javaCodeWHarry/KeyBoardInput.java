package javaCodeWHarry;

import java.util.Scanner;

public class KeyBoardInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Taking input from keyuboard");
		System.out.println("Enter number 1 : ");
		int i = sc.nextInt(); //to take the integer input
		System.out.println("Enter number 2 : ");
		int j = sc.nextInt();
		int sum= i+j;
		System.out.println("The sum of the two number is :"+sum);
		System.out.println("Enter the string");
//		String name= sc.next(); //to take the string input
		boolean b1= sc.hasNext(); //to check weather the input is string or not 
		System.out.println(b1);
		
	}

}
