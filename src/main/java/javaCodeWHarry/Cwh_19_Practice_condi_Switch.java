package javaCodeWHarry;

import java.util.Scanner;

public class Cwh_19_Practice_condi_Switch {

	public static void main(String[] args) {
		//Question 1 : What will be the output of this program: My Answer === it will give an error because 
//		int a = 10;
//		if (a=11) {
//			System.out.println("I am 11");
//			
//		}
//		        
//		else {
//			System.out.println("I am not 11");
//		}
//		
		/*
		Write a program to find out whether a student is pass or fail; 
		if it requires a total of 40% and at least 33% in each subject to pass. 
		Assume 3 subjects and take marks as input from the user.
		*/
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the subject marks in 1");
//		int sub1= sc.nextInt();
//		System.out.println("Enter the subject marks in 2");
//		int sub2= sc.nextInt(); 
//		System.out.println("Enter the subject marks in 3");
//		int sub3= sc.nextInt(); 
//		 int avg = (sub1+sub2+sub3)*100/300;
//		 if(avg>=40 && sub1>=33 && sub2>=33 && sub3>=33) {
//			 System.out.println("You are Pass !");
//		 }
//		 else {
//			 System.out.println("You are fail !");
//		 }
//		 
//		 Write a program to find out the type of website from the URL:
//		System.out.println("Enter the website name...url ");
		String url= sc.next();
		if(url.endsWith(".com")) {
			System.out.println("This is a commercial website !");
		}
		else if(url.endsWith(".org")) {
			System.out.println("This is a organization website !");
		}
		else if (url.endsWith("..in")) {
			System.out.println("This is a india website");
		}
		
		
		
	}
}
