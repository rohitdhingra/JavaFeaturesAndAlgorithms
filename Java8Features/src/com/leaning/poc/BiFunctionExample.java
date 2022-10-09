package com.leaning.poc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionExample implements BiFunction<List<Integer>,List<Integer>,List<Integer>>{

	@Override
	public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
		return Stream.of(list1,list2)
				.flatMap(List::stream)
				.distinct()
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		BiFunction<List<Integer>,List<Integer>,List<Integer>> biFunction = new BiFunctionExample();
		List<Integer> list1 = Stream.of(1,2,3,4,100,6,9,11).collect(Collectors.toList());
		
		List<Integer> list2 = Stream.of(1,2,3,4,6,10,13).collect(Collectors.toList());

		List<Integer> list3 = biFunction.andThen(list ->list.stream().sorted().collect(Collectors.toList())).apply(list1, list2);
		System.out.println("Traditional Approach"+list3);
		
		BiFunction<List<Integer>,List<Integer>,List<Integer>> biFunction1 = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
			
			@Override
			public List<Integer> apply(List<Integer> t, List<Integer> u) {
				return Stream.of(t, u)
						.flatMap(List::stream)
						.distinct()
						.collect(Collectors.toList());
			}
		};
		System.out.println("Annoymous Class"+biFunction1.andThen(list ->list.stream().sorted().collect(Collectors.toList())).apply(list1, list2));
		
		BiFunction<List<Integer>,List<Integer>,List<Integer>> biFunction2 = (l1,l2) -> {
			return Stream.of(l1, l2)
					.flatMap(List::stream)
					.distinct()
					.collect(Collectors.toList());
		};
		
		System.out.println("lamdba approach"+biFunction2.andThen(list ->list.stream().sorted().collect(Collectors.toList())).apply(list1,list2));
		
		Map<String,Integer> map = new HashMap<>();
		map.put("Rohit", 5000);
		map.put("Rahul", 10000);
		map.put("Anchal", 15000);
		
		BiFunction<String,Integer,Integer> increaseSalaryFunction= new BiFunction<String, Integer, Integer>() {

			@Override
			public Integer apply(String t, Integer u) {
				return u+500;
			}
		};
			map.replaceAll(increaseSalaryFunction);
			System.out.println(map);
			
			map.replaceAll((k,v)->{
				return v+500;
			});
			
			System.out.println(map);
	}

}
