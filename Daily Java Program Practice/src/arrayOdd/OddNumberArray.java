package arrayOdd;

public class OddNumberArray {

	public static void main(String[] args) {

		int[] numbers = {5,5,2,1,6,3,7,8,6,0,4,5};
		System.out.println("Odd numbers in the array : ");
		
		for(int oddNumber : numbers ) {
			if(oddNumber%2!=0) {
				System.out.println(oddNumber + "");
			}
		}
	}

}
