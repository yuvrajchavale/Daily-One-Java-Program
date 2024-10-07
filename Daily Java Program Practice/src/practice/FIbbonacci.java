package practice;

public class FIbbonacci {

	public static void main(String[] args) {
		int n = 20 ;
		int n1 = 0 ,  n2 = 1;
		
		for(int i = 1 ; i<= n;i++) {
			System.out.println(n1);
			int n3 = n1 + n2;
			n1 = n2 ;
			n2 = n3 ;
			
		}
		

	}

}
