
package org.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorEx {

	public static void main(String[] args) {

		EmployeeEx1 e1 = new EmployeeEx1(1, "Rajesh");

		EmployeeEx1 e2 = new EmployeeEx1(1, "venu");

		
		EmployeeEx1 e3=new EmployeeEx1(1,"Aaj");
		
		List<EmployeeEx1> e = new ArrayList<>();
		e.add(e3);
		e.add(e1);
		e.add(e2);

		Collections.sort(e,new EmployeeEx1());
		System.out.println(e);

	}

}
