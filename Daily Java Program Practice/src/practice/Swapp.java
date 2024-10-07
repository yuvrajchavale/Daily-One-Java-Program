package practice;

public class Swapp {

	public static void main(String[] args) {
		int a = 80 ,  b = 30 , c;
		c = a ;
		a = b ;
		b = c ;
		
		System.out.println("a:" + a + " b:" + b);
		
		Without3rd();
		
	}
	
	
	public static void Without3rd() {
		
		int a = 30 , b = 40 ;
		a = a + b;
		b = a - b ;
		a = a - b ;
		
		System.out.println("a:" + a + " b:" + b);
	}

}
