package javaCodeWHarry;

import java.util.Scanner;

public class MarksCalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks of sub1 :");
		float sub1 =sc.nextFloat();
		System.out.println("Enter the marks of sub2 :");
		float sub2 =sc.nextFloat();
		System.out.println("Enter the marks of sub3 :");
		float sub3 =sc.nextFloat();
		System.out.println("Enter the marks of sub4 :");
		float sub4 =sc.nextFloat();
		System.out.println("Enter the marks of sub5 :");
		float sub5 =sc.nextFloat();
     		
          float sum= sub1+sub2+sub3+sub4+sub5;
          float average=(sum)*100/500;
          System.out.println("The percentage obtained by student is :"+average+"%");
       		

	}

}
