package com.pdh.helloworld.method;

public class Method1 {
	public static void main(String[] args) {
		int a, b, c;
		int result = sum(100, 120);
		System.out.println("result : " + result);
		
		result = sum(5, 10);
		System.out.println("��� : " + result);
		
		result = multi(result, result);
		System.out.println("����? : " + result);
		
		result = multi(10, 4);
		sum2(100, 120);
	}
	//����Ÿ�� �޼ҵ�� (�Ű�����-�Ķ����)
	public static void sum2(int n1, int n2) {
		System.out.println("��� : " + (n1 + n2));
	}
	
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int multi(int n1, int n2) {
		return n1 * n2;
	}
}


