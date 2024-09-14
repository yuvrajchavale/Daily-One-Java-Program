package september14;

import java.util.Scanner;

public class ReverseNumber2 {

	public static void main(String[] args) 
	{
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the Number to reverse");
    long number = scn.nextLong();
    long rev = 0;
    long rem ; 
    while(number != 0) 
    {
    	rem = number % 10 ;
    	rev = rev * 10 + rem ;
    	number = number/10 ;
    }
    
    System.out.println(rev);

	}

}
