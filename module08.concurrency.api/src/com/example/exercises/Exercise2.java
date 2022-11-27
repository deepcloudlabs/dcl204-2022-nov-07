package com.example.exercises;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.err.println("Application is just started.");
		var task = new TaskB();
		var ft1 = new FutureTask<>(task);
		var ft2 = new FutureTask<>(task);
		var thread1 = new Thread(ft1, "T1");
		var thread2 = new Thread(ft2, "T2");
		thread1.start();
		thread2.start();
		System.err.println(ft1.get());
		System.err.println(ft2.get());
		System.err.println("Application is done.");
	}

}

class TaskB implements Callable<List<Integer>> {

	@Override
	public List<Integer> call() throws Exception {
		return ThreadLocalRandom.current()
                .ints(1,60)
                .distinct()
                .limit(6)
                .sorted() // int
                .boxed()  // Integer
                .toList(); // List<Integer>	
	}

}
