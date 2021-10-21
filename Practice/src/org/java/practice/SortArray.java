package org.java.practice;

import java.util.Arrays;

public class SortArray {

	
	
	public static void main(String[] args) {
		
		
		
		int []a;
		
		a = new int[]{10,20,50,40,60};
		
		
		
		
		for(int i=0;i<a.length;i++) {
			
			
			for(int j=i+1;j<a.length;j++) {
				
				int temp =0;
				if(a[i]<a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
					
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
