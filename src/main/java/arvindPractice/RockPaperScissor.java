package arvindPractice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
	    Random r = new Random();
	    int computer_input = r.nextInt(3);
	    Scanner sc= new Scanner(System.in);
        System.out.println("Enter the user input :");
        int user_input=sc.nextInt();
        
        if(computer_input==0 && user_input==1 || computer_input==1 && user_input==2 || computer_input==2 && user_input==0 ) {
        	System.out.println("Computer wins !\n");
        	
        }
        else {
        	System.out.println(" User wins !");
        	
        }
        
      
      if(computer_input==0) {
    	  System.out.println("The computer input is :Scissor");
      }
      if(computer_input==1) {
    	  System.out.println("The computer input is :Paper");
      }
      if(computer_input==2) {
    	  System.out.println("The computer input is :Rock");
      }
        
	}

}
