package Cwh_Practice;

public class AverageUsingVarArr {
	
	static int avareage(int ...marks) {
		int sum=0;
		for(int element:marks) {
			sum +=element;
		}
		int avg=sum/marks.length;
		return avg;
	}

	public static void main(String[] args) {
		
	int resultavg=	avareage(100,50);
	System.out.println(resultavg);
	int resultavg1=	avareage(100,50,50);
	System.out.println(resultavg1);
	int resultavg2=	avareage(92,98,75,80,90);
	System.out.println(resultavg2);

	}

}
