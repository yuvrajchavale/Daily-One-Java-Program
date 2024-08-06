package numberSwap;

import java.util.Scanner;

public class NumberSwap {

	public static void main(String[] args) {
	       int a, b, c;   
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of X and Y");  
	       a = sc.nextInt();  
	       b = sc.nextInt();  
	       System.out.println("before swapping numbers: "+a +"  "+ b);  
	         
	       c = a;  
	       a = b;  
	       b = c;  
	       System.out.println("After swapping: "+a +"   " + b);  
	       System.out.println( );  


	}

}
