package com.pdh.helloworld;

public class Operator3 {
	public static void main(String[] args) {
		String str = "value";
		int num1 = 10;
		int num2 = 3;
		
		String result1 = (num1 + num2) + str;
		String result2 = str + 1 + num2;
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
