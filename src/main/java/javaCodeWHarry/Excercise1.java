package javaCodeWHarry;

import java.util.Scanner;

public class Excercise1 {

	public static void main(String[] args) {
		//1 Program to add three numbers
		int a =5;
		int b =6;
		int c =7;
		int sum=a+b+c;
		System.out.println("The sum is :"+sum);
//
//		//2 program to get the cgpa of three subjects out of 100
		float sub1=45;
		float sub2=75;
		float sub3=78;
		float cgpa=(sub1+sub2+sub3)/30;
		System.out.println("The cgpa is :"+cgpa+" CGPA");
//		
//		//3 program to get the anme and Good Morning greeting
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name ");
		String name=sc.next();
		System.out.println("Hello !"+name+" Good Morning");
//		
//		//4 program to km to miles convertor 
		
		System.out.println("Enter the Km driven ");
		float km=sc.nextInt();
		double miles=km*0.62;
		System.out.println("Miles driven :"+miles);
//		
		//5 Write a Java program to detect whether a number entered by the user is an integer or not.
		System.out.println("Enter the number ");
		boolean b1 = sc.hasNextInt();
		System.out.println("number entered by the user is integer: "+b1);
		
	}

}
