package Cwh_Practice;

public class Star2 {

	static void starpaater(int n)
	{
		for(int i=n;i>0;i--) {
			  
			  for(int j=1;j<i;j++) {
				  System.out.print(" ");
				  
			  }
			  for(int k=n;k>i;k--) {
				  System.out.print("*");
			   }
System.out.println("");
	}
	}
	public static void main(String[] args) {
//		*
//	   **
//	  ***
//	 ****
		starpaater(6);
}
}
