package com.pdh.helloworld.method;

public class Exam3 {
	public static void main(String[] args) {
		int result = abs(5);
		System.out.println(result); //5
		
		result = abs(-20);
		System.out.println(result); //20
	}
	
	public static int abs(final int num) {
		return num > 0 ? num : -num;
		/*
		if(num > 0) {
			return num;
		} 
		return -num;
		*/
	}
}
