package arvindPractice;

public class Fibonaaci {

	public static void main(String[] args) {
		int n=0;
		int n1=1;
		int temp=0;
		System.out.print("The fibonacci series is :"+n+",");
		for(int i=0;i<=10;i++) {
			int n2= n+n1;
			System.out.print(", "+n2);
			temp=n;
			n=n1;
			n1=n2;
		}
	}
}
