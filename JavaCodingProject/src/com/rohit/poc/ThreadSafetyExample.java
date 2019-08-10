package com.rohit.poc;

class Counter {
	int count;
	public void increment() {
		count++;
	}

}

public class ThreadSafetyExample {

	public static void main(String[] args) {
		Counter c = new Counter();
		for (int i = 0; i < 2000; i++) {
			c.increment();
		}
		System.out.println(c.count);

	}

}
