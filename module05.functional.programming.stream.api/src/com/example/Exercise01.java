package com.example;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Exercise01 {

	public static void main(String[] args) {
		Integer i = Integer.valueOf(42); // boxing
		Integer j = 42; // auto-boxing
		int k = 42;
		i++; 
		i = Integer.valueOf(i.intValue()+1);
		k++;
		draw(60,6,1000).forEach(System.out::println);
	}

	public static List<Integer> draw(int max,int size){
		return ThreadLocalRandom.current()
				                .ints(1,max)
				                .distinct()
				                .limit(size)
				                .sorted() // int
				                .boxed()  // Integer
				                .toList(); // List<Integer>				                
	}
	
	public static List<List<Integer>> draw(int max,int size,int column){
		return IntStream.range(0, column)
				        .parallel()
				        .mapToObj(i -> draw(max,size))
				        .toList();
	}
}
