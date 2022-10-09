package com.leaning.poc;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		BiPredicate<String, String> equalsPredicate = (t1,t2) -> t1.equals(t2);
		BiPredicate<String, String> lengthPredicate = (t1,t2) -> t1.length()==t2.length();
		
		boolean test = lengthPredicate.and(equalsPredicate).test("Rohit","Rahul");
		System.out.println(test);
		
	}
	
}
