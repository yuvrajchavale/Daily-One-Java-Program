package interviewquestions;

public class OddEvenExtract {

	public static void main(String[] args) {
		    String input = "abc123!@#456";
	        
	        String oddNumbers = input.replaceAll("[^13579]", "");
	        String evenNumbers = input.replaceAll("[^02468]", "");

	        System.out.println("Odd Numbers: " + oddNumbers);
	        System.out.println("Even Numbers: " + evenNumbers);

	}

}
