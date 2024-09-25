package practice;

public class EvenOdd {

	public static void main(String[] args) {
		int n [] = {1,2,3,45,85,97,14,15,16};
		int even =0 ,odd =0;
		
		for(int i=0;i<n.length ; i++) {
			if (n[i]%2!=0) {
				odd ++;
			}
			else {
				even++;
			}
		}
		
		System.out.println("Even Number: " + even +" Odd Number: " + odd );

	}

}
