package com.pdh.helloworld.method;

public class RecursionTest {
	public static void main(String[] args) {
		//countDown(10);
		int result = factorial(6);
		System.out.println(result);
	}
	
	public static int factorial(int num) {
		int result = num;
		if(num > 1) {
			result = result * factorial(num - 1);
		} 
		return result;
	}
	
	public static void countDown(int num) {
		System.out.println(num);
		if(num > 0) {
			countDown(num - 1);
		}
	}
}
