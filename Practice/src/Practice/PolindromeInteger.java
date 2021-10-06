package Practice;

public class PolindromeInteger {

	static int check = 143;

	public static void main(String[] args) {

		int temp = check;
		int rem=0;
		int sum=0;

		if (temp <= 0) {

			System.out.println("polindrome");

		} else {

			while (check != 0) {

				rem=check%10;
				
				sum=(sum*10)+rem;
				
				check=check/10;
				
			}
		}
		
		String result=(sum==temp)?"its polindrome":"its not";
		System.out.println(result);
	}
}
