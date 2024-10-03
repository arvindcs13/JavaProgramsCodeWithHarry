package javaCodeWHarry;

public class Cwh_31Methodwithoutstatic {
	 int sum(int x,int y) {
			int z=x+y;
			return z;
		}
		 int sub(int x,int y) {
			int z=x-y;
			return z;
		}
		
		 int multiply(int x,int y) {
			int z=x*y;
			return z;
		}
	public static void main(String[] args) {
		Cwh_31Methodwithoutstatic  cwh= new Cwh_31Methodwithoutstatic(); //Creating an object of the same class inside main because its not the static method
		int a=12;
		int b=4;
		int c = cwh.sum(a, b);
		System.out.println(c);
		int d =cwh.sub(a,b);
		System.out.println(d);
		int e=cwh.multiply(a,b);
		System.out.println(e);
		

	}

}
