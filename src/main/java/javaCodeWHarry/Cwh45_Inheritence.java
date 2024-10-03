package javaCodeWHarry;

class Animal{
	 private void method1() {
		System.out.println(" I am private method,I am available but I am not accesdsbile by creating object of base class");
	}
	public void whoAmIparent() {
		System.out.println(" I am a Animal");
	}
	
	public void speak() {
		System.out.println("I can speak");
	}
	public void tail() {
		System.out.println("I have a tail");
	}
	public void eat() {
		System.out.println("I can eat ");
	}
	
}
class Dog extends Animal{
	
	public void whoAmI() {
		System.out.println("I am a dog");
	}
	
	public void bark() {
		System.out.println("Bark ...");
	}
	public void tail() {
		System.out.println("I have a round tail");
	}
	public void eatanything() {
		System.out.println("I am omnivores ");
	}
	
}
public class Cwh45_Inheritence {
	
 public static void main(String[] args) {
	 Dog d= new Dog();
	 d.whoAmI();
	 d.whoAmIparent();
	 d.speak();
	 d.bark();
	 d.eat();
	 d.eatanything();
//	 d.method1();  this you cannot acces by creating the object of dog you can because its access modifier is private
	 
	 
}
}
