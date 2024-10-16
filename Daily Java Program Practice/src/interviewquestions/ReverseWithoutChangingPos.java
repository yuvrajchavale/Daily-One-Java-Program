package interviewquestions;

public class ReverseWithoutChangingPos {

	public static void main(String[] args) {
		String input = "ABC EFG";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse().toString()).append(" ");
        }

        System.out.println(result.toString().trim());

	}

}
