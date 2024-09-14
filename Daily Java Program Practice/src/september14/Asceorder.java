package september14;

import java.util.Arrays;
import java.util.Scanner;

public class Asceorder {

	public static void main(String[] args) {
		//String num = "59594949";
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String for increase order ");
		String number = scn.nextLine();
		char[] digits = number.toCharArray();  
		Arrays.sort(digits);
		String sortedOutput = new String(digits);
		System.out.println(sortedOutput);

	}

}
