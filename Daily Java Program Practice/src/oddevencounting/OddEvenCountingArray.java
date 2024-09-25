package oddevencounting;

public class OddEvenCountingArray {

	public static void main(String[] args) {
		int num [] = {1,2,86,89,74,45,87,54,74,68};
		
		int even= 0 , odd =0 ;
		for(int i = 0 ; i<num.length ; i++) {
		if(num[i]%2==0) {
			even++;
		}	
		else {
			odd++;
		}
		}
		
		System.out.println("Even Number " + even + "\n Odd Number : " + odd);

	}

}
