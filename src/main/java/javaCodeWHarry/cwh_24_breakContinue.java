package javaCodeWHarry;

public class cwh_24_breakContinue {
public static void main(String[] args) {
	
	//break;
	
//	for (int i=0;i<=5;i++)
//	{
//		System.out.println(i);
//		if(i==3) {
//			break;
//		}
//	}
	
	//Continue 
	for (int j=0;j<=5;j++)
	{
		
		if(j==3) {
			continue;
		}
		System.out.println(j); //its skipped printing 3 because the loop is moved to next itration because of continue statement
		
	}
	
}
}
