package com.rohit.poc;

class Counter {
	int count;

	public synchronized void increment() {
		count++;
	}

}

public class ThreadSafetyExample {

	public static void main(String[] args) throws InterruptedException {
		
		long initial2 = System.currentTimeMillis();
		Counter c1 = new Counter();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 100000; i++) {
					c1.increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 100000; i++) {
					c1.increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		long dur2 = System.currentTimeMillis() - initial2;
		System.out.println("Time take to process using multiple thread" + dur2 + "ms");
		System.out.println(c1.count);

	}

}
