package arvindPractice;

public class Fibonaaci_usingRecurrsion {
	
	static int fibo(int x) {
		if(x==1) {
			return 1;
		}
		else if(x==2) {
			return 1;
		}
		else {
			return fibo(x-1)+fibo(x-2);
		}
	}

	public static void main(String[] args) {
//		1,1,2,3,5,8
		
		System.out.println(fibo(6));
		
	}
}
