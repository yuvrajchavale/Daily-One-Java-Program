package practice;

public class Stringreverse {

	public static void main(String[] args) {
		String input = "Yuvraj" ;
		String emp = " ";
		
		for(int i = 0;i<input.length();i++) {
			char ch = input.charAt(i);
			emp = ch + emp ;
		}
		
		System.out.println(emp);
		
		StringRev();
	}
	
	
	public static void StringRev() {
		String n = "I'm Tester";
		
		StringBuffer sb = new StringBuffer(n).reverse();
		System.out.println(sb);
		
		
	}

}
