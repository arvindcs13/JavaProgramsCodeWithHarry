package javaCodeWHarry;

import java.util.Scanner;

public class cwh12_excercise2 {

	public static void main(String[] args) {
		
		//What will be the result of the following expression:
		float a=7/4.0f * 9/2.0f;
		System.out.println(a);
		
		//Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
		char c='B';
		//Encryption
		 c= (char) (c+8);
		 System.out.println(c);
		 
		 //Decreyption 
		 c= (char) (c-8);
		 System.out.println(c);
		 
		 
		 //Use comparison operators to find out whether a given number is greater than the user entered number or not.
		 
		 int num_given=45;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the number ");
		int arvind_num= sc.nextInt();
		boolean b1 = (num_given>arvind_num);
		System.out.println(b1);
		 
		 
		 System.out.println(7*49/7+35/7);



	}

}
