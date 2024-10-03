package Star;

public class Star5 {

	public static void main(String[] args) {
		
for(int c=1;c<5;c++) {
			
			for(int j=5;j>=c;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=c;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=1;i<=5;i++) {
			
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			
			
			System.out.println();
			
		}
		
		
	}

}
