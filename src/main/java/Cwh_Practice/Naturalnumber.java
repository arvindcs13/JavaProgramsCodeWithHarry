package Cwh_Practice;

public class Naturalnumber {
static int sumnatural(int n ) {
	if(n==0 || n==1) {
		return 1;
	}
	else {
		return n+sumnatural(n-1);
	}
}


	public static void main(String[] args) {
//		Write a recursive function to calculate the sum of first n natural numbers.
	int result=	sumnatural(10);
		System.out.println(result);
	}

}
