package javaCodeWHarry;

public class Cwh_31_MethodStatic_1 {
	
	static int sum(int x,int y) {
		int z=x+y;
		return z;
	}
	static int sub(int x,int y) {
		int z=x-y;
		return z;
	}
	
	static int multiply(int x,int y) {
		int z=x*y;
		return z;
	}
	
public static void main(String[] args) {
	int a =12;
	int b =4;
	int c=sum(a,b); ///By static you can directly call a method because it shares same memory to the class which is associated you do not need to create the object
	System.out.println(c);
	int d=sub(a,b);
	System.out.println(d);
	int e = multiply(a,b);
	System.out.println(e);
}
}
