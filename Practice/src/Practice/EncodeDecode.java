package Practice;

import java.util.Arrays;
import java.util.Base64;

public class EncodeDecode {

	
	public static void main(String[] args) {
		String s="12345";
		
		
		String encodedString = Base64.getEncoder().encodeToString(s.getBytes());
		System.out.println(encodedString);

		
		
		byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
		System.out.println(Arrays.toString(decodedBytes));
		String decodedString = new String(decodedBytes);
		System.out.println(decodedString);
		
	}
}
