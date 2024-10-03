package Threading;

class Arvind implements Runnable{

	
	@Override
	public void run() {
		System.out.println("I am a thread whioch m,aded by runnable interface");
		
	}
	
}

public class Cwh_73ThreadConstrinterface {
public static void main(String[] args) {
	Arvind a= new Arvind();
	Thread t1= new Thread(a,"Arvind");
    t1.start();
    System.out.println("Thread name is Arvind"+t1.getName());
}
}
