package javaCodeWHarry;

public class Cwh_15StringPractice {

	public static void main(String[] args) {
		
		//Write a Java program to convert a string to lowercase.
		String name = "ArvInd";
		String namelowerCase=name.toLowerCase();
		System.out.println(namelowerCase);
		
		//Write a Java program to replace spaces with underscores
		String name2="Ar  v i nd";
		String nameremovespaces=name2.replace(" ", "_");
		System.out.println(nameremovespaces);
		
		//Write a Java program to fill in a letter template which looks like below:
		String letter = "Dear <|name|>, Thanks a lot!";
		String type2=letter.replace("<|name|>", name);
		System.out.println(type2);
		
		//Write a Java program to detect double and triple spaces in a string.
		String myString = "This string contains double and  triple spaces";
		int indesxedouble= myString.indexOf("  ");
		int indesxetriple= myString.indexOf("  ");
		System.out.format("the index of double spaces are %d and the index of triple spaces are %d\n",indesxedouble,indesxetriple);
		
		String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
        
        
	}
}
