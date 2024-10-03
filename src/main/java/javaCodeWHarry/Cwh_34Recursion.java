package javaCodeWHarry;

public class Cwh_34Recursion {

	
	static int factorial(int a) {
		if(a==0 || a==1) {
			return 1;
		}
		else {
			return a*factorial(a-1);
		}
	}
	
	
	static int factorial_itrative(int b) {
		
		if(b==0 || b==1) {
			return 1;
		}
		else {
			int fact=1;
			for(int i=1;i<=b;i++) {  //increasing for loop
				
				fact=fact*i;
			}
			return fact;
		}
		
	}
	
	
static int factorial_itrative1(int c) {
		
		if(c==0 || c==1) {
			return 1;
		}
		else {
			int fact=1;
			for(int i=c;i>=1;i--) {   //decreasing for loop
				
				fact=fact*i;
			}
			return fact;
		}
		
	}
	
	public static void main(String[] args) {
		int x=6;
		
		System.out.format("The factorial of x is %d",factorial(x));
		System.out.println();
		System.out.format("The factorial of x is %d",factorial_itrative(x));
		System.out.println();
		System.out.format("The factorial of x is %d",factorial_itrative1(x));
		
	}
}
