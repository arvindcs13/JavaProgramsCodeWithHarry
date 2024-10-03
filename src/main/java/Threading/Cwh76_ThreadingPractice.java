package Threading;

class MyThr extends Thread{
	
	public void run()
	{
//		while(true) {
//			System.out.println("Gud Morning");
//		}
		System.out.println("Gud Morning");
		
	}
}

class MyThr1 extends Thread{
	
	public void run()
	{
		while(true) {
			System.out.println("Welcome");
		}
	}
}

public class Cwh76_ThreadingPractice {

	public static void main(String[] args) throws Throwable {
		
		MyThr t1= new MyThr();
		MyThr1 t2= new MyThr1();
		t1.sleep(2000);  //Question 2
        t1.start();
		t1.setPriority(Thread.MAX_PRIORITY); //Question3
		System.out.println(t1.getPriority()); //Question3
		System.out.println(t1.getState());  //Question 4
		System.out.println(t1.currentThread().getState()); //Question 5 :How do you get the reference to the current thread in Java?
//		t2.start();
	}
}
