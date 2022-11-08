package com.example;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class Exercise02 {

	public static void main(String[] args) {
		var numbers = List.of(4,8,15,16,23,42);
		Predicate<Integer> ifEven = n -> n%2 == 0;
		ToIntFunction<Integer> toCube = u -> u*u*u;
		var sum = numbers.stream()
				         .filter(ifEven)
				         .mapToInt(toCube)
				         .sum();
		System.out.println(sum);
	}

}
