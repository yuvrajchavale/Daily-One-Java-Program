package practice;

public class SttarPattern {

	public static void main(String[] args) {
		normal();
		upNormal();
		Combine();

	}
	
	public static void normal() {
		System.out.println("First Triangle");
		for(int i = 1 ; i<=4 ; i++) {
			for(int j=1 ; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void upNormal() {
		System.out.println("Second Traingle");
		for(int i = 1 ; i<= 4 ; i++) {
			for(int j = 4 ;j>=i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Combine() {
		System.out.println("Third Triangle");
		
		for(int i = 1; i<=4 ; i++) {
			for(int j = 1; j<=i ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i = 1; i<=4 ; i++) {
			for(int j = 3 ; j>=i ; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
