package org.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMap {

	public static void main(String[] args) {
		
		
		
		
		
		Map <Integer,String>m=new HashMap<>();
		
		m.put(1,"Rajesh");
		
		m.put(2, "kris");
		System.out.println(m.size());
		m.forEach((k,v)->System.out.println(k));
		
		
		for(Entry<Integer,String>x:m.entrySet()) {
			
			
			
			System.out.println(x.getKey());
			System.out.println(x.getValue());
			
			
			
			
			
		}
		Set<Integer> s=m.keySet();
			s.forEach(x->System.out.println(x));
		m.forEach((k,v)->System.out.println(v));
		
	}
}
