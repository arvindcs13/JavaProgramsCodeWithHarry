package interviewQuestionCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program1 {
	
public static void main(String[] args) {
	//Comparing element in ArraYList
	ArrayList<Integer> al1= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	ArrayList<Integer> al2= new ArrayList<Integer>(Arrays.asList(1,2,3,4,6));
	
	Collections.sort(al1);
	Collections.sort(al2);
	System.out.println(al1.equals(al2));
	
	//Finding additional element in arraylist in al3
	
	ArrayList<Integer> al3= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
	ArrayList<Integer> al4= new ArrayList<Integer>(Arrays.asList(1,2,3,4,6));
	
	al3.removeAll(al4); 
	System.out.println(al3);
	
	//Finding missing element in arraylist in al5
	ArrayList<Integer> al5= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
	ArrayList<Integer> al6= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
	al6.removeAll(al5);
	System.out.println(al6);
	
	//Finding common in both the arraylist al8
	ArrayList<Integer> al7= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
	ArrayList<Integer> al8= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
	al8.retainAll(al7);
	System.out.println(al8);
}
}
