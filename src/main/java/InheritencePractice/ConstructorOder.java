package InheritencePractice;


class Base{
	public Base() {
		System.out.println("I am a base class contructor");
	}
}
class Derviced extends Base{
	public Derviced() {
		System.out.println("I am a Derviced class contructor");
	}
	
}

class Derviced2 extends Derviced{
	public Derviced2() {
		System.out.println("I am a Derviced2 class contructor");
	}
}

public class ConstructorOder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derviced2  obj = new Derviced2();
	}

}
