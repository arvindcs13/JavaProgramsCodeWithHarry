package arvindPractice;

public class AKYadav {
	
	public static String convertName(String fullName) {
        String[] nameParts = fullName.split(" ");
        if (nameParts.length != 3) {
            throw new IllegalArgumentException("Full name must consist of three parts: first, middle, and last name.");
        }
        String firstInitial = nameParts[0].charAt(0) + ".";
        String middleInitial = nameParts[1].charAt(0) + ".";
        String lastName = nameParts[2];
        return firstInitial + middleInitial + " " + lastName;
    }
	
	    public static void main(String[] args) {
	        String fullName = "Arvind Kumar Yadav";
	        String convertedName = convertName(fullName);
	        System.out.println(convertedName);
	    }

	    
	
}
