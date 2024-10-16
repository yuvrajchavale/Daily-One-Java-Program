package interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class VowelsOccurance {

	public static void main(String[] args) {
		String input = "This is an example string";
        Map<Character, Integer> vowelCount = new HashMap<>();
        String vowels = "AEIOUaeiou";

        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                vowelCount.put(c, vowelCount.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Vowel Count: " + vowelCount);

	}

}
