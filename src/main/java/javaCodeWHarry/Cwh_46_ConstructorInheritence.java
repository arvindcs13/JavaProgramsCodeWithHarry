package javaCodeWHarry;

class GrandParent {
	public GrandParent() {
		System.out.println("I am a constructor of class GrandParent");
	}
	public GrandParent(int a) {
		System.out.println("I am a overloaded constructor of class GrandParent"+a);
	}
}

class Parent extends GrandParent {

	public Parent() {
		
		System.out.println("I am a constructor of class Parent");
	}
public Parent(int b, int c ) {
//		super(b);
		System.out.println("I am a Overloaded constructor  of class Parent" +c);
	}

}

class Child extends Parent{
public Child() {
		
		System.out.println("I am a constructor of class Parent");
	}
public Child(int b, int c,int d ) {
		super(b,c);
		System.out.println("I am a Overloaded constructor  of class Parent" +d);
	}
}

public class Cwh_46_ConstructorInheritence {
	public static void main(String[] args) {
//       Parent p = new Parent(2,3);
		Child c= new Child(2,3,4);
	}
}
