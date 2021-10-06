package Practice;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WhiteSpace {
	public static void main(String[] args) {

		String str="raj venu";
		
		str=str.replaceAll("\\s", "");

		System.out.println(str);
		System.out.println("\"Rajesh\"");
		
		
		String x="heeelloow";
		HashMap<Character,Integer> h=new HashMap<>();
			char[]z=	x.toCharArray();
			
			for(int i=0;i<x.length()-1;i++) {
				if(h.containsKey(z[i])) {
				h.put(z[i],h.get(z[i])+1);	
				}else {
					h.put(z[i],1);
				}
				
			}
			
			Set<Character> s=new HashSet<>(h.keySet());

			for(Character c:s) {
				if(h.get(c)>1) {
					System.out.println("the word "+c+" has been repted "+h.get(c)+ " times");
				}
			}
			
	}
}
