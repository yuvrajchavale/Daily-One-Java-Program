package practice;

public class primeN {

	public static void main(String[] args) {
		int num = 13 , temp = 0;
		for(int i = 2;i<=num-1;i++) {
			if(num%i==0) {
				temp = temp + 1;
			}
		}

		if(temp>0) {
			System.out.println("Not Prime Number");
		}
		else {
			System.out.println("Prime Number");
		}
	}

}
