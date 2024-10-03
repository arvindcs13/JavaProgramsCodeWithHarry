package Threading;

class MyThread32 extends Thread{
	public MyThread32(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("I am a thread");
	}
}

public class Cwh_73ThreadConstructor {
	public static void main(String[] args) throws Throwable {
		MyThread32 t1= new MyThread32("Harry");
		
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		t1.sleep(2000);
		t1.start();
	}
}
