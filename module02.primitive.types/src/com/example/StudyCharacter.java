package com.example;

public class StudyCharacter {

	public static void main(String[] args) {
		char c = 'x'; // 2-byte, unsigned int, unicode
		System.out.println(c);
		System.out.println((char)(c+1));
		c = '\u20BA';  
		System.out.println(c);
		

	}

}
