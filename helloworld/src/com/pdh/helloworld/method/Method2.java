package com.pdh.helloworld.method;

public class Method2 {
	static int age = 10;
	
	public static void main(String[] args) {
		hello();		
		System.out.println(hi());
	}
	
	public static void hello() {
		System.out.printf("�ȳ� �� ���̴�  %d�Դϴ�.\n", age);
	}
	
	public static String hi() {
		return "Hi";
	}
}
