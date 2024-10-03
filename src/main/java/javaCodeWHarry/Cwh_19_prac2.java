package javaCodeWHarry;

import java.util.Scanner;

public class Cwh_19_prac2 {

	public static void main(String[] args) {
		
//		Write a program to find out the type of website from the URL:
//		System.out.println("Enter the website name ..");
		Scanner sc = new Scanner(System.in);
//      String website = sc.next();
//      if(website.endsWith(".org")){
//          System.out.println("This is an organizational website");
//      }
//      else if(website.endsWith(".com")){
//          System.out.println("This is a Commercial website");
//      }
//      else if(website.endsWith(".in")){
//          System.out.println("This is an Indian website");
//      }

      //Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]
      
      int day;
      System.out.println("Enter the number");
      day=sc.nextInt();
      switch(day) {
      case 1 :
    	  System.out.println(" Its a Monday");
    	break;
      case 2 :
    	  System.out.println(" Its a Tuesday");
    	  break;
      case 3 :
    	  System.out.println(" Its a Wednesday");
    	  break;
      case 4 :
    	  System.out.println(" Its a Thursday");
    	  break;
      case 5 :
    	  System.out.println(" Its a Friday");	
    	  break;
      case 6: 
    	  System.out.println(" Its a Saturday");	
    	  break;
      default:
    	  System.out.println(" Its a Sunday");	
    	  break;
    	  
      }
	}
}
