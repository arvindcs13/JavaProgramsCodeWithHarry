package javaCodeWHarry;

public class Cwh_32_MethodOverloadingVoid {
//Void methods
	//m1
	static void foo() {
		System.out.println("Good Moring broo !");
	}
	
	//m2
	static void foo(int a) {
		System.out.println("Good Morning "+a+" Broo !");
	}
	
	//m3
	static void foo(int a,int b) {
		System.out.println("Good Morning "+a+" Broo !");
		System.out.println("Good Morning "+b+" Broo !");
	}
	//m4
	static void foo(int a,String st) {
		System.out.println("Good Morning "+a+" Broo !");
		System.out.println("Good Morning "+st+" Broo !");
	}
	
//	static int foo(int a, int b) {   //This is wrong to create same method by changing retrun type
//		return a+b;                  // it will not allowed in java 
//	}                                //you need to change the parameter count/data type to create method with same name  
	
	
	//like this m5
	static int foo(int a, int b,int c) {
		return a+b+c;
	}
	
	
	
	public static void main(String[] args) {
	     foo(); //callling m3
	     foo(3); //callling m2
	     foo(300,400); //callling m3
	     foo(500,"Arvind");//callling m4
	     System.out.println(foo(200,300,500)); //callling m5 the one with return type
	     
	     
	     
	}
}
