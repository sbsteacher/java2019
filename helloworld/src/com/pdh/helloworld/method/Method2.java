package com.pdh.helloworld.method;

public class Method2 {
	static int age = 10;
	
	public static void main(String[] args) {
		hello();		
		System.out.println(hi());
	}
	
	public static void hello() {
		System.out.printf("안녕 내 나이는  %d입니다.\n", age);
	}
	
	public static String hi() {
		return "Hi";
	}
}
