package reverseNumber;

public class ReverseNumber {

	public static void main(String[] args) {
		
		String input = "9908500700";
		String reversed = new StringBuilder(input).reverse().toString();

	    System.out.println("Reversed Output: " + reversed);

	}

}
