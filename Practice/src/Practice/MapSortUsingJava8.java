package Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;

public class MapSortUsingJava8 {

	public static void main(String[] args) {
		
	
	Map<Integer,String> m=new HashMap<>();
	m.put(3,"venu");
	m.put(1,"raje");
	m.put(2, "wajesh");
	
	List <Entry<Integer,String>>l=new ArrayList<>(m.entrySet());
	
	Collections.sort(l,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
	l.stream().forEach(e->System.out.println(e));
	m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);;
	
	
	
	List<Integer>intList=Arrays.asList(1,2,4,5,6);
	Optional<Integer> big=intList.stream().reduce((a,b)->a>b?a:b);
	System.out.println(big.get());
	
	
	OptionalDouble avg=intList.stream().mapToInt(i->i).average();
	System.out.println(avg.getAsDouble());
	
	
	Integer biggest=intList.stream().reduce(Integer::max).get();
	System.out.println(biggest);
	}
	
	
}
