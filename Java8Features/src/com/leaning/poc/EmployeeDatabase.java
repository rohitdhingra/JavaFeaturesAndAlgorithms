package com.leaning.poc;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {
	public static List<Employee> getEmployees() {
		return Stream.of(new Employee(1,"john","A",60000),
				new Employee(2,"peter","B",30000),
				new Employee(3,"Mak","A",80000),
				new Employee(4,"Kim","A",90000),
				new Employee(5,"Shawn","C",60000))
				.collect(Collectors.toList());
	}
}
