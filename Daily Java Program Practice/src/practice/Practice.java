package practice;

public class Practice {

	public static void main(String[] args) {
		int n = 100 ;
		System.out.println("Odd Number List");
		for(int i = 1 ; i<n ;i++) {
			if(i%2 != 0) {
				System.out.print(i);
			}
			else {
				System.out.println();
			}
		}

	}

}
