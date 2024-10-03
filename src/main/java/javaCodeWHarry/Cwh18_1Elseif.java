package javaCodeWHarry;

import java.util.Scanner;

public class Cwh18_1Elseif {

	public static void main(String[] args) {
		System.out.println("Enter your age : ");
		Scanner sc= new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=56) {
			System.out.println("Your are experienced !");
		}
		else if(age>36) {
			System.out.println("Your are semi- experienced !");
		}
		else if(age>24) {
			System.out.println("Your are semi-semi- experienced !");
		}
		else {
			System.out.println("You are baby !");
		}
	}
}
