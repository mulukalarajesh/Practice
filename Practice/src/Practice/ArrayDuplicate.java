package Practice;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicate {
	public static void main(String[] args) {

		int[] a = { 10, 10, 20, 15, 30, 15 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}

		
		
		
		Set<Integer> s=new HashSet<>();
		
		for(int x:a) {
			
			
			if(s.add(x)) {
				
			}else {
				System.out.println("from hashSet");
				System.out.println(x);
			}
		}
		
	
	
	
	}
}
