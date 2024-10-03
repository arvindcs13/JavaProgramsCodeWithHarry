
interface One{
	void method1();
}

interface Two extends One{
	void method2();
	void method3();
}

interface Three extends Two{
	void method4();
}

class Four implements Three{

	//You must need to implement all the method which is available in the above interface as there are inherited from each other
	//otherwise program will give error
	
	@Override
	public void method1() {
		System.out.println("Method1");
		
	}
	
	@Override
	public void method2() {
		System.out.println("Method2");
		
	}

	@Override
	public void method3() {
		System.out.println("Method3");
		
	}

	

	@Override
	public void method4() {
		System.out.println("Method4");
		
	}
	
}
public class Cwh_58InheritenceInIterface {
	
 public static void main(String[] args) {
	 Four vc= new Four();
	 vc.method1();
	 vc.method2();
	 vc.method3();
	 vc.method4();
}
}
