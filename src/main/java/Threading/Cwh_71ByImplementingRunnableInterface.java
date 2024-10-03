package Threading;

class MyThread1 implements Runnable{

	@Override
	public void run() {
		int b=0;
		
		System.out.println("Thanks");
//		while(b<=40000) {
//			System.out.println("Thread of Class MYThread1");
//			b++;
//		}
		
	}
	
}

class MyThread21 implements Runnable{

	@Override
	public void run() {
		int b=0;
		System.out.println("You");
//		while(b<=40000) {
//			System.out.println("Thread of  MYThread21 Arvind");
//			b++;	
//		}
		
	}
	
}

public class Cwh_71ByImplementingRunnableInterface {
public static void main(String[] args) {
	
	MyThread1 bullet1= new MyThread1();
	Thread gun1= new Thread(bullet1);  //This is an example of constructor 1 in thread
//	gun1.start();
	System.out.println(gun1.getName());
	System.out.println(gun1.getId());
	System.out.println(gun1.getPriority());
	System.out.println(gun1.getState());
	
	
//	MyThread21 bullet2= new MyThread21();
//	Thread gun2= new Thread(bullet2);
//	gun2.start();
	
}
	
}
