package javaCodeWHarry;

public class Cwh_33VariableArrguments {

	/*
	 * by doing soo you can add as many value as you want because it treats all the argument as array
	 */
        static int mysum(int ...arr) {
        	int sum=0;
        	for(int a:arr) {
        		sum=sum+a;
        	}
        	return sum;
        }
        
        //By doing so you cann set the bar atleast one element is should be there 
        void fooo(int a,int ...arr1) {
        	
        	for(int element:arr1) {
        		a=a+element;
        	}
        	System.out.println(a);
        }
	
	public static void main(String[] args) {
		System.out.println(mysum(1));
		System.out.println(mysum(1,2));
		System.out.println(mysum(1,2,3,4,5));
         
		Cwh_33VariableArrguments obj= new Cwh_33VariableArrguments();
//		obj.fooo(); ///Not allowed atleast one element is should be there 
		obj.fooo(1,2,3,4,5,6,7,8,9);
	}

}
