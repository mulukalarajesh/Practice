package Practice;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

	
	
	public static void main(String[] args) {
		
		
		Supplier<String> s=()->"hello";
		System.out.println(s.get());
		
		
		
		
		//List<String> l=Arrays.asList("a","b");
		List<String> l=Arrays.asList();
		
		//if in stream of list element present it returns element
		//from list or orelseget takes supllier as argument and returns the dummy value 
		String a=l.stream().findAny().orElseGet(()->"hai");
		
		//or we can pass reference of supplier 
		//String a=l.stream().findAny().orElseGet(s);

		System.out.println(a);
	}
}
