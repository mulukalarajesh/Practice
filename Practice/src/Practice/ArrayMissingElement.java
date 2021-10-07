package Practice;

public class ArrayMissingElement {

	
	
	public static void main(String[] args) {
		
		int n=5;
		int []a= {1,2,3,4};
		
		
		
		int x=(n*(n+1))/2;
		
		int temp=0;
		for(int y:a) {
			temp=temp+y;
			
		}
		System.out.println("missing number is "+ (x-temp));
		
		
	}
}
