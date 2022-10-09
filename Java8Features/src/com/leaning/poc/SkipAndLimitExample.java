package com.leaning.poc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SkipAndLimitExample {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//2 to 8 values
		intList.stream().skip(1).limit(7).forEach(System.out::println);
		Map<Integer, Integer> collect = intList.stream().collect(Collectors.toMap(x->x,y -> y*100));
		System.out.println(collect);
	}

}
