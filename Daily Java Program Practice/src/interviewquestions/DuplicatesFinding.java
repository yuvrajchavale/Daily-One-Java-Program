package interviewquestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesFinding {

	public static void main(String[] args) {
		
		 String input = "abacabc";
	        Set<Character> seen = new HashSet<>();
	        
	        for (char c : input.toCharArray()) {
	            if (!seen.add(c)) {
	                System.out.println("Duplicate found: " + c);
	            }
	        }


	}

}
