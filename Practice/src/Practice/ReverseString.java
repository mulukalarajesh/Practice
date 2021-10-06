package Practice;

public class ReverseString {
 
	
	public static void main(String[] args) {
		String s="Rajesh";
		String rev="";
		
		char[] x=s.toCharArray();
		for(int i=x.length-1;i>=0;i--) {
			rev=rev+x[i];
			
		}
		System.out.println(rev);
		
		
	}
}
