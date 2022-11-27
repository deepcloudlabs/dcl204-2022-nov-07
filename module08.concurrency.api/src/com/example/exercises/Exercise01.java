package com.example.exercises;

public class Exercise01 {

	public static void main(String[] args) throws InterruptedException {
		System.err.println("Application is just started.");
		var task = new TaskA();
		var thread1 = new Thread(task,"T1");
		var thread2 = new Thread(task,"T2");
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.err.println("Application is done.");
	}

}

class TaskA implements Runnable {

	@Override
	public void run() {
		for (var i = 0; i < 10; ++i) {
			System.err.println("%s: %d".formatted(Thread.currentThread().getName(),i));	
		}

	}

}
