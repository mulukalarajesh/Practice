package Practice;
@FunctionalInterface
public interface FunctionEx {
void foo();
}
class Test1 {
	
	
	public static void main(String[] args) {
		 FunctionEx f=()-> 
		 System.out.println("hello");		

		f.foo();

	}


	
	
}