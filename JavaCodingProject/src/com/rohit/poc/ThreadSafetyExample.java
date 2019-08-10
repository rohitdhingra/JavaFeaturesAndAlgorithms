package com.rohit.poc;

class Counter {
	int count;
	public void increment() {
		count++;
	}

}

public class ThreadSafetyExample {

	public static void main(String[] args) {
		long initial = System.currentTimeMillis();
		Counter c = new Counter();
		for (int i = 0; i < 2000; i++) {
			c.increment();
		}
		long dur = System.currentTimeMillis() - initial;
		System.out.println("Time take to process using single thread"+dur+"ms");
		System.out.println(c.count);

	}

}
