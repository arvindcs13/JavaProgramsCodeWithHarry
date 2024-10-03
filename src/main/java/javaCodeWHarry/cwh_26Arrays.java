package javaCodeWHarry;

public class cwh_26Arrays {

	public static void main(String[] args) {/*
	
		Arrays are the collections of similar  types of data 
		There are three ways to decleare arrays 
		*/
		int []marks; //Declaration
		marks= new int[5]; //Memory Allocation
		//Intialization
		marks[0]=100;
		marks[1]=100;
		marks[2]=100;
		marks[3]=100;
		marks[4]=100;
		
		System.out.println(marks[4]);
		
		
		int []marks1 = new int[5]; //Declaration+Memory Allocation
		//Intialization
		marks1[0]=10;
		marks1[1]=70;
		marks1[2]=65;
		marks1[3]=76;
		marks1[4]=34;
//		marks1[5]=78;
//		System.out.println(marks1[5]); //throws an error because memory allocation is done for this element java.lang.ArrayIndexOutOfBoundsException : Index 5 out of bounds for length 5
		System.out.println(marks1.length);
		
		int marks2[]= {32,48,79,54,65}; //Declartion + memory allocation + intialization
		
		//Traversing in arrays 
//		for(int i =0;i<marks2.length;i++) {
//			System.out.println(marks2[i]);
//		}
		
		/*
		 * For Each loop in java 
		 */
//		System.out.println(marks2); //This will not work 
		
		System.out.println("Printing using for each loop");
		for(int arvind : marks2) {
			System.out.println("The element in array are :"+ arvind);
		}
		
		System.out.println("Printing the array in reverse order ");
		for(int i=marks2.length-1;i>=0;i--) {
			System.out.println(marks2[i]);
		}
	}
}
