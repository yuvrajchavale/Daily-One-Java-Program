package interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class CountSpecialChar {

	public static void main(String[] args) {
		String input = "abc123!@#abc";
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character Count: " + countMap);
    	
	}

}
