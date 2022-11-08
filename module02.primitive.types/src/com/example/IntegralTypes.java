package com.example;

import java.math.BigInteger;

public class IntegralTypes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// integral types, all signed: byte, short, int, long
		// 1-B
		byte b= 127; // [-128..127] // -128: 0x1000 0000
		                          //  127: 0x0111 1111
		                          //       0x0000 0001
		                          //       0x1000 0000
		                          //     -   0111 1111 + 0000 0001 = 1000 0000 
		b=127;
		System.out.println("b=%d".formatted(b));
		b++;
		System.out.println("b=%d".formatted(b));
		b=-128;
		System.out.println("b=%d".formatted(b));
		b--;
		System.out.println("b=%d".formatted(b));
		// 2-B [-32768..32767]
		short s= Short.MAX_VALUE;
		System.out.println("s=%d".formatted(s));
		s++;
		System.out.println("s=%d".formatted(s));
		// 4-B [-2147483648..2147483647]
		int i = Integer.MAX_VALUE;
		System.out.println("i=%d".formatted(i));
		++i;
		System.out.println("i=%d".formatted(i));
		// 8-B [-9223372036854775808..9223372036854775807]
		long x = Long.MAX_VALUE;
		System.out.println("x=%d".formatted(x));
		++x;
		System.out.println("x=%d".formatted(x));
		// BigInteger, Immutable Class
		BigInteger z = BigInteger.valueOf(Long.MAX_VALUE);
		System.out.println("z=%s".formatted(z.toString()));
		z = z.add(BigInteger.ONE);
		System.out.println("z=%s".formatted(z.toString()));
		long u = Integer.MAX_VALUE + 1L; // ALU
		System.out.println("u=%d".formatted(u)); // 2147483648 ?
		byte q=127, t= 1;
		byte w;
		w = (byte)(q + t); // int addition -> ALU
		System.out.println("w=%d".formatted(w));
		w += q + t; // w = (byte)(w + q + t);		
//		int one = 0/0; // NaN
//		System.out.println("one=%d".formatted(one));
//		int inf = 1/0;
//		System.out.println("inf=%d".formatted(inf));
		int p = 9 / 2;
		System.out.println("p=%d".formatted(p));
		int r = 9 % 2;
		System.out.println("r=%d".formatted(r));
		long a = 5432L + 12345;
		System.out.println("a=%d".formatted(a));
		int salary = 0b100_000;		
	}

}
