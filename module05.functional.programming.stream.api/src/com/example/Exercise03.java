package com.example;

import java.util.concurrent.atomic.AtomicInteger;

public class Exercise03 {

	public static void main(String[] args) throws InterruptedException {
		var task = new TaskC();
		var thread1 = new Thread(task,"T1");
		var thread2 = new Thread(task,"T2");
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.err.println(task.getCounter());
	}

}

class TaskC implements Runnable {
	private AtomicInteger counter= new AtomicInteger();

	@Override
	public void run() {
		for (var i = 0; i < 100_000; i++)
			counter.getAndIncrement();				
	}

	public int getCounter() {
		return counter.get();
	}

}