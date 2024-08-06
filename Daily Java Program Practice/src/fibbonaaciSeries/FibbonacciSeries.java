package fibbonaaciSeries;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int num = 10; // still ten
		FibbonacciSeries.seriesPrint(num);

	}

    public static void seriesPrint(int num) {
    	int a = 0;
    	int b = 1;
    	
    	
    	for (int i = 1; i <=num; i++) {
		
    	System.out.println(a + " ");
    		
    	int nextNum = a + b;
    	a =b ;
    	b = nextNum;
    	
    	
    	}
    	
    }	
}
