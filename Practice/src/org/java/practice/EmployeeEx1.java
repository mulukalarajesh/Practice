package org.java.practice;

import java.util.Comparator;

public class EmployeeEx1 implements Comparator<EmployeeEx1>{
	private int age;

	private String name;

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeEx1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public EmployeeEx1() {
		super();
	}

	
	@Override
	//if age equal we are sorting by name 
	
	
	public int compare(EmployeeEx1 o1, EmployeeEx1 o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()==o2.getAge()) {
			return o1.getName().compareTo(o2.getName());
		}else if(o1.getAge()<o2.getAge()) {
			return -1;
			
		}else {
			return +101;
		}
	}

	@Override
	public String toString() {
		return "EmployeeEx1 [age=" + age + ", name=" + name + "]";
	}

	
	
	
}
