package com.pdh.helloworld;

public class InequalitySignOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a < b); // a�� b���� �̸��ΰ�?
		System.out.println(a > b); // a�� b���� �ʰ��ΰ�?
		System.out.println(a + b <= c); // a+b���� c���� �����ΰ�?
		System.out.println(a + b >= c); // a+b���� c���� �̻��ΰ�?
		System.out.println(a + b != c); // a+b���� c���� �̻��ΰ�?
		System.out.println(a + b == c); // a+b���� c���� �̻��ΰ�?

		System.out.println("---------------------------------------");
		String str1 = new String("�ȳ��ϼ���"); // String str1 = "�ȳ��ϼ���";
		String str2 = str1;
		

		Integer num1 = 10;
		int num2 = 10;

		System.out.println("num1 == num2 : " + (num1 == num2));

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str1));
	}
}












