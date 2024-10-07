package practice;

public class Palindrome {

	public static void main(String[] args) {
		int palindrome = 4141;
		int check = palindrome ;
		int rem , rev=0;
		
		while(check!=0) {
			rem = check % 10;
			rev = rev * 10 + rem ;
			check = check / 10;
		}
		System.out.println(rev);
		
		if(palindrome == rev ) {
			System.out.println("Palindrome Number");
			
		}
		else {
			System.out.println("Not Palindrome Number");
		}
	}

}
