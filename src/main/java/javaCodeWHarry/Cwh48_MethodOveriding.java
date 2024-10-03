package javaCodeWHarry;

class A {
	public void meth1() {
		System.out.println("I am neth1 of class A");
	}
	
	public int  meth2() {
		return 4;
	}
}

class B extends A {
	@Override
	public void meth1() {
		System.out.println("I am neth1 of class B");
	}
	
//	public void meth2() {
//		System.out.println(" I am the meth2 of class B"); //Cant acheive Overiding the return type should be same
//	}
}

public class Cwh48_MethodOveriding {
	public static void main(String[] args) {
		B b = new B();
		b.meth1(); // it will execute meth1 of Class B

//	 To get the meth1 of class A you need to create an object of A like
		A a = new A();
		a.meth1();   // you can only call the overided method of class A by creating it object and calling it with reference object
	}
}