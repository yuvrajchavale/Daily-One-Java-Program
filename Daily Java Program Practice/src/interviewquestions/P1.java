package interviewquestions;

public class P1 {

	public static void main(String[] args) {
		
		String a = "ccchghythtyhjtubbbaaa";
		
		
		for(int i=0; i<a.length(); i++) {
			int count = 0;
			for(int j=0; j<a.length(); ++j) {
				if(a.charAt(i) == a.charAt(j) && i>j) {
					break;
				}
				if(a.charAt(i) == a.charAt(j)) {
					count++;
				}
			}
			
			if(count > 0) {
				System.out.print(a.charAt(i) + "" +count);
			}
			
		}
		
		
		
		
	
		

	}

}
