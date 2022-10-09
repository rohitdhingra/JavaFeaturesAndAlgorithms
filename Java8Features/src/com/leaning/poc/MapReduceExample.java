package com.leaning.poc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapReduceExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		int sum = numbers.stream().mapToInt(i -> i).sum();
		System.out.println(sum);
		
		Integer reduceSum = numbers.stream().reduce(0, (a,b)-> a+b);
		System.out.println(reduceSum);
		
		System.out.println(numbers.stream().reduce((t1,t2)->t1*t2).get());
		
		System.out.println(numbers.stream().reduce(0, (a,b)-> a>b?a:b));
		
		System.out.println(numbers.stream().reduce(Integer::max).get());
		
		List<String> words = Arrays.asList("Rohit","Sheena","Tina");
		
		Optional<String> str = words.stream().reduce((a,b)-> a.length()<b.length()?a:b);
		System.out.println(str.get());
		
		System.out.println(EmployeeDatabase.getEmployees().stream().filter(emp -> emp.getGrade().equals("A"))
		.map(e -> e.getSalary())
		.mapToDouble(e -> new Double(e))
		.average().getAsDouble());
//				.collect(Collectors.toMap(Employee::getId,Employee::getName));
//		System.out.println( collect);
	}

}
