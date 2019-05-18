package com.rohit.poc;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayListInPlace {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();
		cities.add("Abohar");
		cities.add("Jalandhar");
		cities.add("Noida");
		cities.add("Mumbai");
		
		//Printing original list
		System.out.println("Original List"+cities);
		
		//Reversing the original List
		int size = cities.size();
		for(int i=0;i<size/2;i++)
		{
			final String city = cities.get(i);
			cities.set(i, cities.get(size-i-1));
			cities.set(size-i-1, city);			
			
		}
		
		System.out.println("Reversed List:"+cities);

	}

}
