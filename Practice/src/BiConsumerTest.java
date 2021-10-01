import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BiConsumerTest {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> con = (t, u) -> {
			System.out.println(t);
			System.out.println(u);

		};

		con.accept(10, 20);

		BiFunction<Integer, Integer, List<Integer>> f = (t, u) -> Arrays.asList(t, u);

		Function<List<Integer>, List<Integer>> ft = (x) ->
		x.stream().sorted().collect(Collectors.toList());
		;

		System.out.println(f.andThen(ft).apply(2, 3));//and then mathod takes function but in function lamda 
		//the input should be same of bifunction return type

		Map<Integer, String> m = new HashMap<>();

		m.put(1, "100");

		m.put(2, "200");

		BiFunction<Integer, String, String> bc = (i, s) -> s + "200";

		m.replaceAll(bc);//it works only on values

		System.out.println(m);
	}
}
