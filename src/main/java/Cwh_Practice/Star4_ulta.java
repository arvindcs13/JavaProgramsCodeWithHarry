package Cwh_Practice;

public class Star4_ulta {

static void ultastar(int a) {
	for(int i=0;i<=a;i++) {
		for(int j=a;j>i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
//		Write a function to print the following pattern:
//		    ****
//
//		    ***
//
//		    **
//
//		    *
		ultastar(5);
		

	}

}
