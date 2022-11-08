package com.example;

public class StudyString {

	public static void main(String[] args) {
		// static -> constant pool -> object pooling -> caching
		// String -> Immutable
		String name1 = "jack";  // CP
		String name2 = "jack";  // CP
		String name3 = new String("jack"); // Heap
		System.out.println("name1 == name2 ? "+(name1 == name2));
		name3 = name3.intern(); // internalize: Heap -> CP
		System.out.println("name1 == name3 ? "+(name1 == name3));
		System.out.println("name1 == name2 ? "+(name1.equals(name3)));
		System.out.println("name1 == name3 ? "+(name1.equals(name3)));
		name1.toUpperCase();
		System.out.println(name1);
		System.out.println("2+2="+(2+2));
	}

}
