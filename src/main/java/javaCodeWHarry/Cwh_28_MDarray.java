package javaCodeWHarry;

public class Cwh_28_MDarray {

public static void main(String[] args) {
	int [][]flats;// Declaration
	flats= new int[2][3]; // Memory Allocation
	//Intitialization of 2d Array
	 flats[0][0]=101;
	 flats[0][1]=102;
	 flats[0][2]=103;
	 flats[1][0]=201;
	 flats[1][1]=202;
	 flats[1][2]=203;
	 
//	 System.out.println(flats.length);
	 System.out.println("Printing a 2-D array using for loop"); 
	 for(int i=0;i<flats.length;i++) {
		 System.out.print("{");
		 for(int j=0;j<flats[i].length;j++) 
		    {
			 System.out.print(" "+flats[i][j]+" ");
		 }
		 System.out.println("}");
		 System.out.println();
	 }
	 
	 
	 //not more then 2d arrays are required 
	 
	 
	 
	
	 
	
}
}
