package Practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test4 {
public static void main(String[] args) {
	Employee e2=new Employee(12, "xyz");
	Employee e1=new Employee(10, "Rajesh");
	Employee e3=new Employee(15, "xyz");
	
	List <Employee> l=new ArrayList<>();
	l.add(e3);
	l.add(e1);
	l.add(e2);
	Collections.sort(l,new Employee());
	System.out.println(l);
}
	
}
class Employee implements Comparator<Employee>{
	public Integer age;
	
	public String name;

	
	public Employee() {
		super();
	}






	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	




	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}






	public Integer getAge() {
		return age;
	}






	public void setAge(Integer age) {
		this.age = age;
	}






	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int compare(Employee o1, Employee o2) {
	return o1.getAge().compareTo(o2.getAge());
	
	}
	
	
	
}
class A {
	
	
	
	@SuppressWarnings("unused")
	private void help() {
		
		
	}
}
class B extends A{
	
}
