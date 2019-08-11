package com.pdh.helloworld;

public class InequalitySignOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a < b); // a가 b보다 미만인가?
		System.out.println(a > b); // a가 b보다 초과인가?
		System.out.println(a + b <= c); // a+b값이 c보다 이하인가?
		System.out.println(a + b >= c); // a+b값이 c보다 이상인가?
		System.out.println(a + b != c); // a+b값이 c보다 이상인가?
		System.out.println(a + b == c); // a+b값이 c보다 이상인가?

		System.out.println("---------------------------------------");
		String str1 = new String("안녕하세요"); // String str1 = "안녕하세요";
		String str2 = str1;
		

		Integer num1 = 10;
		int num2 = 10;

		System.out.println("num1 == num2 : " + (num1 == num2));

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str1));
	}
}












