package javaCodeWHarry;

import java.util.Random;
import java.util.Scanner;

class Game{
	int user_input;
	int computer_input;
	int noOfGuess;
	
	
	public Game(){
		Random r = new Random();
		computer_input=r.nextInt(100);	
		System.out.println(computer_input);
	}
	
	
	
	public int getGuess_the_number() {
		return noOfGuess;
	}



	public void setGuess_the_number(int guess_the_number) {
		this.noOfGuess = guess_the_number;
	}



	public int takeUserInput() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number you want to choose");
		user_input=sc.nextInt();
		return user_input;
	}
	
//Harry way	
//	public boolean isCorrectNumber() {
//		noOfGuess++;
//		if(user_input != computer_input) {
//			System.out.println("Number by user is not matched ");
//			System.out.println("Number by user is Try Again !");
//			takeUserInput();
//			isCorrectNumber();
//		}
//		else {
//			System.out.println("You won !");
//			System.out.println("The number of Guess you take is :"+noOfGuess);
//		}
//		if(user_input==computer_input) {
//		    System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", computer_input, noOfGuess);
//			return true;	
//		}
//		else if(user_input<computer_input){
//            System.out.println("Too low...");
//        }
//        else if(user_input>user_input){
//            System.out.println("Too high...");
//        }
//        return false;
//		
//	}
	
	//My  way
	public void isCorrectNumber() {
		noOfGuess++;
		if(user_input > computer_input) {
			System.out.println("Number is Too High ");
			System.out.println("Number by user is Try Again !");
			takeUserInput();
			isCorrectNumber();
		}
		else if(user_input < computer_input) {
			System.out.println("Number is Too Low ");
			System.out.println("Number by user is Try Again !");
			takeUserInput();
			isCorrectNumber();
		}
		else {
			System.out.println("You won !");
			System.out.println("The number of Guess you take is :"+noOfGuess);
		}
	}
	
	
	
}

public class Excercise3 {
 public static void main(String[] args) {
	Game g= new Game();
	g.takeUserInput();
	g.isCorrectNumber();

	
}
}
