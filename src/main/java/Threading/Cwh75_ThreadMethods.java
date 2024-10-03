package Threading;

class Mythread123 implements Runnable {

	@Override
	public void run() {
		int i=0;
		while (i>4000) {
			System.out.println("I am the thread");
			i++;
		}

	}

}

class Mythread234 implements Runnable {

	@Override
	public void run() {
		int i=0;
		while (i>4000) {
			System.out.println("I am the thread of class 23");
			i++;
		}

	}

}

public class Cwh75_ThreadMethods {
	public static void main(String[] args) throws Throwable {
		Mythread123 g1= new Mythread123();
		Thread t1= new Thread(g1);
		
		Mythread234 g2 = new Mythread234();
		Thread t2= new Thread(g2);
		t1.start();
		t1.join(); //So the next thread will wait to finish execution of t1
		t2.start();
		
	}
}
