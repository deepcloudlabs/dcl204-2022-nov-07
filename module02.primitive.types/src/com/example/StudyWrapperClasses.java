package com.example;

import java.util.ArrayList;
import java.util.List;

public class StudyWrapperClasses {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// byte -> Byte
		// short -> Short
		// int -> Integer
		// long -> Long
		// char -> Character
		// boolean -> Boolean
		// float -> Float
		// double -> Double
		// 1M Element -> 4M
		// List<int> numbers;
		// 1M -> Element -> 16M
		List<Integer> numbers = new ArrayList<>();
		// x is a local variable -> Stack
		// x is a value typed -> primitive -> int
		int x = 42; // 4-Byte
		x++;
		// y is a local variable -> Stack
		// y is a reference variable
		Integer y = 42; // 4-byte (Stack) + 12-byte (Object-Header) + 4-byte
		y++;
		y = Integer.valueOf(y.intValue() + 1);
		// -XX:AutoBoxCacheMax=2048
		Integer u = Integer.valueOf(42); // CP
		Integer v = Integer.valueOf(42); // CP
		Integer p = 549; // Heap -> CP
		Integer q = 549; // Heap -> CP
		System.out.println("u==v ? " + (u == v));
		System.out.println("p==q ? " + (p == q));
		System.out.println("u==v ? " + (u.equals(v)));
		System.out.println("p==q ? " + (p.equals(q)));
	}

}
