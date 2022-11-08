package com.example;

import java.math.BigDecimal;

public class FloatingPointTypes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// IEEE-764
		// float: 4-byte
		float pi = 3.1415161718192021F;
		// double: 8-byte
		double x = 3.1415;
		float money = 1_000_000_000;
		money = money + 50;
		System.out.println("%12.3f".formatted(money));
		
		double u = (0.1+0.2)+0.3;
		double v = 0.1+(0.2+0.3);
		System.out.println("u==v: "+(u==v));
		
		double w = 2.0;
		w = 2 - 1.10;
		System.out.println("%12.16f".formatted(w));

		double q = 4.35;
		q = 100 * q;
		System.out.println("%12.16f".formatted(q));
		
		BigDecimal z = BigDecimal.valueOf(4.35); // Immutable
		z = z.multiply(BigDecimal.valueOf(100L));
		System.out.println("%12.16f".formatted(z));
		
		double one = 0/0.; // FPU
		System.out.println("%12.16f".formatted(one));
		System.out.println(Double.isNaN(one));
			
		one++;
		System.out.println("%12.16f".formatted(one));
		
		double inf = 1/0.; // FPU
		System.out.println("%12.16f".formatted(inf));
		double minusInf = -1/0.; // FPU
		System.out.println("%12.16f".formatted(minusInf));
		
	}

}
