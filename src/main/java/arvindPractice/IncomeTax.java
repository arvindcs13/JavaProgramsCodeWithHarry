package arvindPractice;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary... !");
        float salary=sc.nextInt();
        float tax=0;
        if(salary<=250000) {
        	System.out.println("Tax you need to pay is :"+tax);
        }
        else if(salary>250000 && salary<=500000) {
//        	System.out.println("This is your salary"+salary);
        	tax = (float) (salary*0.05);
        	System.out.println("Tax you need to pay is :"+tax);
        }
        else if(salary>500000 && salary<=1000000) {
//        	System.out.println("This is your salary"+salary);
        	tax=(float) (250000*0.05);
        	salary=salary-500000;
        	tax=(float) (tax+(salary*(0.20)));
        	System.out.println("Tax you need to pay is :"+tax);
        	
        }
       else if(salary>1000000) {
    	   tax=(float) ((float) (250000*0.05)+(500000*0.20));
       	   salary=salary-1000000;
       	   tax=(float) (tax+(salary*(0.30)));
       	   System.out.println("Tax you need to pay is :"+tax);
        }
        
	}

}
