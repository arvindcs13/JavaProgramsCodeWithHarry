package arvindPractice;

public class ArvindKumarYadav {

	public static void main(String[] args) {
		String full_name="Arvind Kumar Yadav";
		String []arr=full_name.split(" ");
		if(arr.length!=3) {
			throw new IllegalArgumentException("Full name must consist of three parts: first, middle, and last name.");
		}
		String firsthalf=arr[0].charAt(0)+".";
		String secondthalf=arr[1].charAt(0)+".";
		String conevrted_name=firsthalf+secondthalf+arr[2];
		
		System.out.println(conevrted_name);
		
	}
}
