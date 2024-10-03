package javaCodeWHarry;

public class Cwh_29_PracticeArray {

	public static void main(String[] args) {
//1/Create an array of 5 floats and calculate their sum.

//	 float []array= {1.23f,2.23f,3.234f,4.23f,2.123f};
//	 float sum=0;
//	 
//	 for(float element:array) {
//		 sum=sum+element;
//	 }
//	 System.out.println(sum);
//	 

//Write a program to find out whether a given integer is present in an array or not.
//		int[] arrayint = { 2, 3, 4, 5, 67, 78, 90, 100 };
//		int temp = 69;
//		boolean b1 = false;
//		for (int arvind : arrayint) {
//			if (temp == arvind) {
//				b1 = true;
//				break;
//			}
//
//		}
//		if (b1) {
//			System.out.println("Yes found !");
//		} else {
//			System.out.println("Not found !");
//		}

//3. Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
//		float[] physicsMarks = { 98,90,45,76,65 };
//		int length=physicsMarks.length;
//		float sum=0;
//		for (float marks:physicsMarks) {
//			sum=sum+marks;
//		}
//		float avrage_marks=sum/length;
//		System.out.println(avrage_marks);

//4. Create a Java program to add two matrices of size 2x3.
//		int [][]pool= {{1,2,3},
//				       {1,2,3}};
//		int [][]pool2= {{10,10,10},
//			           {10,10,10}};
//		
//		int [][]result= {{0,0,0},
//				         {0,0,0}};
//				
//		for(int i=0;i<pool.length;i++) {
//			System.out.print("{ ");
//			for(int j=0;j<pool[i].length;j++) {
//				result[i][j]=pool[i][j]+pool2[i][j];
//				System.out.print(result[i][j]+" ");
//			}
//			System.out.print(" }");
//			System.out.println();
//		}

		// 5.Write a Java program to reverse an array.
//		int[] arrayint = { 92, 3, 4, 5, 67, 78, 90, 100,101 };
//		int temp;
//		int len=arrayint.length;
//		int n = len/2; //
//		
//		for(int i=0;i<n;i++) {
//			temp=arrayint[i];
//		    arrayint[i]=arrayint[len-i-1];
//		    arrayint[len-i-1]=temp;
//	//Swapping is going on this number    
//		}
//		
//		for (int element:arrayint) {
//			System.out.print(" "+element);
//		}

//Write a Java program to find the maximum element in an array.
//		int[] arrayint = { 92, 3, 4, 5, 201, 78, 90,101 };
//		int max=0;
//		for(int e : arrayint) {
//			if(max<e) {
//				max=e;
//			}
//		}
//		System.out.println("The maximum element is "+max);

//Write a Java program to find the minimum element in an array.		
//		int[] arrayint = { -92, 3, -4, 5, -201, 78, 90, -401 };
//		int min = Integer.MAX_VALUE;
//		System.out.println(min);
//		for (int e : arrayint) {
//			if (min > e) {
//				min = e;
//			}
//		}
//		System.out.println("The minimum value in arra is :"+min);
	
	
//Write a Java program to find whether an array is sorted or not.
		int[] arrayint = {1,2,5,29,34 };
		boolean isSorted=true;
		for(int i=0;i<arrayint.length-1;i++) {
			if(arrayint[i]>arrayint[i+1]) {
				isSorted=false;	
				break;
			}
			
		}
		if(isSorted) {
			System.out.println("Sorted !");
		}
		else {
			System.out.println("Not Sorted !");
		}
		
		
		
        
	
	}
}