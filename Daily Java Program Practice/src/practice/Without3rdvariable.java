package practice;

public class Without3rdvariable {

	public static void main(String[] args) {
		int a = 50 , b= 80;
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a +" " +b);

	}
}
