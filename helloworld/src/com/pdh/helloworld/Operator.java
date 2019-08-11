package com.pdh.helloworld;

public class Operator {
	public static void main(String[] args) {
		int a = 1000;
		int b = 3333;
		System.out.printf("a + b = %,d\n", a + b);
		System.out.printf("a - b = %d\n", a - b);
		System.out.printf("a * b = %,d\n", a * b);
		System.out.printf("a / b = %d\n", a / b);
		System.out.printf("10.0 / 3.0 = %f\n", 10.0 / 3.0);
		System.out.printf("a / b = %.1f\n", (double)a / (double)b);
		System.out.printf("a / b = %.2f\n", (double)(a / b));
		System.out.printf("a %% b = %d\n", a % b);
	}
}







