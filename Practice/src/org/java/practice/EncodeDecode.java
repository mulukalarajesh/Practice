package org.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

public class EncodeDecode<T> {

	
	public static void main(String[] args) {
		String s="";
		
		
		String encodedString = Base64.getEncoder().encodeToString(s.getBytes());
		System.out.println(encodedString);

		
		
		byte[] decodedBytes = Base64.getDecoder().decode("MTAwNzN8MjAyMS0xMC0yMCAwOTozOTozOA==");
		System.out.println(Arrays.toString(decodedBytes));
		String decodedString = new String(decodedBytes);
		System.out.println(decodedString);
		
		
EncodeDecode<String>e=new EncodeDecode<>();

List<String>l=new ArrayList<>();

l.add("mrahesh@gmail.com");
l.add("siridadsprincess@gmail.com");

if(l.contains("mrahesh@gmail.com")) {
	System.out.println(true);
}else {
	System.out.println("failed");
}
		
	}
	
	void hello(T t){
		System.out.println(t);
		
	}
	
	
	
	
	
	
	
}
