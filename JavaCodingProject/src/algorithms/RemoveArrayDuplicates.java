package com.rohit.poc;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveArrayDuplicates {

	private static volatile String[] rohit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] test = {1,1,2,2,3,4};
		//initial array
		for(Integer i: test)
		System.out.print(","+i);
		System.out.println();
		//using collections
		Set<Integer> set = removeDuplicatesUsingCollection(test);
		System.out.println(set);
		
		//without using collections
//		Integer[] test = removeDuplicatesUsingCollection(test);
		for(Integer i: test)
		System.out.print(","+i);
		System.out.println();
//		System.out.println(test);
		String s;
	}

	/*
	 * private static Integer[] removeDuplicatesWithoutUsingCollection(Integer[]
	 * test) { Arrays.sort(test);
	 * 
	 * int result[]
	 * 
	 * }
	 */
	private static Set<Integer> removeDuplicatesUsingCollection(Integer[] test) {
		List<Integer> list = Arrays.asList(test);
		System.out.println(list);
		Set<Integer> set = new LinkedHashSet<Integer>(list);
		return set;
	}

}
