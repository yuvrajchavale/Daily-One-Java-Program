package interviewquestions;

public class PullAlpahabetsAndAny {

	public static void main(String[] args) {
        String input = "abc123!@#AEIOU";
        
        String alphabets = input.replaceAll("[^a-zA-Z]", "");
        String numbers = input.replaceAll("[^0-9]", "");
        String specialChars = input.replaceAll("[a-zA-Z0-9]", "");
        String vowels = input.replaceAll("[^aeiouAEIOU]", "");

        System.out.println("Alphabets: " + alphabets);
        System.out.println("Numbers: " + numbers);
        System.out.println("Special Characters: " + specialChars);
        System.out.println("Vowels: " + vowels);

	}

}
