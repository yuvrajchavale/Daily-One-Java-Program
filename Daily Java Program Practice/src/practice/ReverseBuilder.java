package practice;

public class ReverseBuilder {

	public static void main(String[] args) {
		String reverse = "Maddy";
		
		String reverseS = new StringBuilder(reverse).reverse().toString();
		System.out.println(reverseS);
		

	}

}
