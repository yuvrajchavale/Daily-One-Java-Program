package increasingOrder;

import java.util.Arrays;

public class IncreasingOrder {

	public static void main(String[] args) {
		 String input = "9908500700"; 
		 // Input as a String to preserve leading zeros

	        // Convert the input String to a character array
	        char[] digits = input.toCharArray();

	        // Sort the character array
	        Arrays.sort(digits);

	        // Convert the sorted character array back to a String
	        String sortedOutput = new String(digits);

	        // Output the sorted string
	        System.out.println("Sorted Output: " + sortedOutput);

	}

}
