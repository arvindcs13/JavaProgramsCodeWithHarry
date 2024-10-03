package cwh_exceptions;

import java.io.FileInputStream;

public class Vedio2_CheckedException {

	public static void main(String[] args) {
		
		/*
		 *  here the compiler is warning to add try-catch block  or use throw by this red underline it means 
		 *  that compiler can check this exception so this is a compile time or CheckedException
		 *  It will show like this under you handle it dosen't matter file exist at particular location or not
		 */
		FileInputStream fis = new FileInputStream("C:\\Users\\Vijay\\Documents\\Zoom\\abc.txt");

	}

}
