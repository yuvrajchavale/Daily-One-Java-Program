package september14;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number to reverse");
		String number = scn.nextLine();
		String rev = new StringBuilder(number).reverse().toString();
		System.out.println(rev);
}
}