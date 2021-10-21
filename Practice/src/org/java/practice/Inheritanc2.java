package org.java.practice;



class Student{
	
	public String name;
	public int age;
	public int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	
	
}
class Person extends Student{
	
	public double average;

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	@Override
	public String toString() {
		return "person [average=" + average + "]";
	}
	
	
}
public class Inheritanc2 {

	
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(1);
		s.setAge(5);
		s.setName(" xyz ");
		System.out.println(s.toString());
		
		Person p=new Person();
		p.setId(6);
		p.setAverage(5.5);
		p.setAge(6);
		p.setName("abc");
		System.out.println(p.toString());
	}
}

