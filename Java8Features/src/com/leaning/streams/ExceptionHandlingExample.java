package com.leaning.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("44","373","123");
		List<Integer> intList = list.stream().map(Integer::parseInt).collect(Collectors.toList());
		System.out.println(intList);
	}

}
