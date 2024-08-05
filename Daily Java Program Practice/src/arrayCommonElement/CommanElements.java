package arrayCommonElement;

import java.util.HashSet;
import java.util.Set;

public class CommanElements {

	public static void main(String[] args) {
		int [] A1 = {12,12,14,51,84,97};
		int [] A2 = {12,14,12,15,51,42,85};
		findCommonElements(A1, A2);

	}

	public static void findCommonElements(int[] A1,int[]A2) 
	{
		Set<Integer> set1 = new HashSet<>();
		for(int  num : A1) {
			set1.add(num);
	}
		
	//Hashset to store common elements
		Set<Integer> commonElements = new HashSet<>();
		for(int  num : A2) {
			if(set1.contains(num)) {
				commonElements.add(num);
		}
	}
		System.out.println("Common Elements :" + commonElements);
	
	}
}
