package rightTriangle;

import java.util.Iterator;

public class StarPattenRightTriangle {

	public static void main(String[] args) {
	
		right();
		reverseRight();
		pascalRight();

	}
	
	public static void  right()
	{
	    System.out.println("First Method To Print Right Triangle ");   
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
    public static void  reverseRight()
    {
    	System.out.println("\n" + "Second Method To Print Reverse Right Triangle");
	    for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
 
    public static void  pascalRight()
    {
    	System.out.println("\n" + "Third Method To Print Combination of Both Triangle");
    	for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    	
    	for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
    	
	}

}
