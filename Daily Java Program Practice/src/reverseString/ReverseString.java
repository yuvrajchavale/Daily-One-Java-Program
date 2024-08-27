package reverseString;

public class ReverseString {

	public static void main(String[] args) {
		String StringToRev = "Yuvraj";
		String ReverseString = "";
		
		for(int i=0;i<StringToRev.length();i++) {
			ReverseString = StringToRev.charAt(i) + ReverseString;
		}
		
		System.out.println("Reversed String: " + ReverseString);

	}

}

