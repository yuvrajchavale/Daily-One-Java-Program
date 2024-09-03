package swapwithoutthirdvariable;
import java.util.Scanner;
public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		System.out.println("Enter X and Y Numebr to swap ");
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		System.out.println("Before Swapping numbers : " + X + " " + Y);
		X = X + Y;
		Y = X - Y;
		X = X - Y;
		System.out.println("After Swapping " + X + " " + Y);
	}

}
