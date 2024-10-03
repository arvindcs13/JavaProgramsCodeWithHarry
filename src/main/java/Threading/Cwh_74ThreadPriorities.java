package Threading;

class Mythread12 implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("I am the thread");
		}
		
	}
	
	
}

class Mythread23 implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("I am the thread of class 23");
		}
		
		
	}
	
	
}

public class Cwh_74ThreadPriorities {
	
public static void main(String[] args) {
	Mythread12 bullet1= new Mythread12();
	Thread t1 = new Thread(bullet1,"Harry");
	
	Mythread23 bullet2= new Mythread23();
	Thread t2 = new Thread(bullet2,"Harry1");
	t1.setPriority(5);
	t2.setPriority(Thread.MAX_PRIORITY);
	System.out.println(t2.getPriority());
	 t1.start();
	
	 t2.start();
	 
	
	
	
}
}
