package javaCodeWHarry;

public class Cwh32_valuechangeinsideMethodandArray {
	
	//m1
	static int foo(int a, int b,int c) {
		
		
		
		 if(a>b) {
			 int d=a+b+c;
			 return d;
		 }
		 else {
			int  d=a+c;
			 return d;
		 }
		
	}
	
	static void change(int d) {
		
		System.out.println("The value of d is :"+d);
		d=99;
	}
	
	public static void main(String[] args) {
		//Calling m1
		int x=7;
		int y=10;
		int z=8;
		int result =foo(x,y,z);
		System.out.println(result);
		change(9);
		
	}
}
