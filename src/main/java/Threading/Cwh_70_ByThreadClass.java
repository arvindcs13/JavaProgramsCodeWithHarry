package Threading;

class MyThread extends Thread {

	@Override
	public void run() {
		int i = 0;
		while (i < 2000) {
			System.out.println("I am the thread of MyThread");
			i++;
		}
	}
}

class MyThread2 extends Thread {

	@Override
	public void run() {
		int i = 0;
		while (i < 2000) {
			System.out.println("I am the thread of MyThread2");
			i++;
		}
	}
}

public class Cwh_70_ByThreadClass {

	public static void main(String[] args) {
		
		MyThread t1= new MyThread();
		t1.start();
//		System.out.println(t1.getId());
		
		MyThread2 t2= new MyThread2();
		t2.start();
//		System.out.println(t2.getId());

	}

}
