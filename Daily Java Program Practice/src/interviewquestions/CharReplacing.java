package interviewquestions;

public class CharReplacing {

	public static void main(String[] args) {
		    String input = "abc123";
	        char oldChar = 'a';
	        char newChar = 'z';
	        
	        String replacedString = input.replace(oldChar, newChar);
	        System.out.println("Replaced String: " + replacedString);

	}

}
