import java.util.Comparator;
import java.util.TreeSet;

public class ComparaterEx {

	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<>((o1,o2)-> -o1.compareTo(o2));
		t.add(21);
		t.add(15);
		t.add(30);
		System.out.println(t);
	}

}

class Mycomparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2)
			return -1;

		else if (01 < 02)
			return +1;
		else
			return 0;

	}
}