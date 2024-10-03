package AbstractandINterfaceAndPolyMorphismandInhertitencepractice;


interface BasicAnimal{
	 void eat();
	 void sleep();
}
class Monkey{
	public void jump() {
		System.out.println("Jump...");
	}
	
	public void bite() {
		System.out.println("Jump...");
	}
}

class Human extends Monkey implements BasicAnimal{
	public void Mard() {
		System.out.println("I am a male human");
	}
	
	public void Aurat() {
		System.out.println("I am a female human");
	}

	@Override
	public void eat() {
		System.out.println("I can eat .....");
		
	}

	@Override
	public void sleep() {
		System.out.println(" I am sleeping...");
		
	}
}
public class Pblm2 {
	public static void main(String[] args) {
		
		
	}

}
