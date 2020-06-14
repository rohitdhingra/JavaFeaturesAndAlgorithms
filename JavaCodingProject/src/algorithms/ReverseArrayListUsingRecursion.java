package com.rohit.poc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ReverseArrayListUsingRecursion {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
//		List<String> fruits = new LinkedList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		
		
	
		//Printing the original list
		System.out.println("Original List:"+fruits);
		//Reversing the ArrayList/Linkedist using Collections.reverse
		Collections.reverse(fruits);
		
		System.out.println("Reversed List :"+fruits);

		// Reversing using the custom method -- Recursion
		System.out.println("Reversed to Original List:"+reverseListRecursively(fruits));
	}

	private static List<String> reverseListRecursively(List<String> list) {


		if(list.size()<=1)
		{
			return list;
		}
		
		List<String> reversed = new ArrayList<>();
		reversed.add(list.get(list.size()-1));
		reversed.addAll(reverseListRecursively(list.subList(0, list.size()-1)));
		
		
		return reversed;
	}

}
