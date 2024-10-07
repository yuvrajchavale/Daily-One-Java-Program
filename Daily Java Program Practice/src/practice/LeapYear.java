package practice;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2023 ;
		if ((year%4 == 0) || (year%100 != 0 && year%400 == 0) ) {
			System.out.println("This is leap Year : "+ year );
			
		}
		else {
			System.out.println("This is not leap Year : "+ year );
		}

	}

}
