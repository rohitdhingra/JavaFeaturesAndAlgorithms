package com.leaning.poc;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample implements BiConsumer<String,Integer>{

	@Override
	public void accept(String t, Integer u) {
		System.out.println(t+":"+u);
	}
	public static void main(String[] args) {
		BiConsumer<String, Integer> biConsumerExample = new BiConsumerExample();
		biConsumerExample.accept("Rohit", 1);
		
		BiConsumer<String,Integer> biConsumer1 = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String t, Integer u) {
				System.out.println(t+":"+u);				
			}
		};
		biConsumer1.accept("Rahul", 2);
		
		BiConsumer<String,Integer> biConsumer2 = (t1,t2) ->System.out.println(t1+":"+t2);
		
		biConsumer2.accept("Anchal", 3);
		
		Map<String,Integer> map = new HashMap<>();
		map.put("Rohit", 5000);
		map.put("Rahul", 10000);
		map.put("Anchal", 15000);
		
		map.forEach((k,v)->System.out.println(k+":"+v));
		}

}
