package com.pdh.helloworld.method;

public class Method1 {
	public static void main(String[] args) {
		int a, b, c;
		int result = sum(100, 120);
		System.out.println("result : " + result);
		
		result = sum(5, 10);
		System.out.println("결과 : " + result);
		
		result = multi(result, result);
		System.out.println("뭘까? : " + result);
		
		result = multi(10, 4);
		sum2(100, 120);
	}
	//리턴타입 메소드명 (매개변수-파라미터)
	public static void sum2(int n1, int n2) {
		System.out.println("결과 : " + (n1 + n2));
	}
	
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int multi(int n1, int n2) {
		return n1 * n2;
	}
}


