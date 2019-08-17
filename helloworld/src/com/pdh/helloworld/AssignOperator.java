package com.pdh.helloworld;

public class AssignOperator {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		b = a;
		System.out.println(b); //b: 3
		
		a += 1; // a = a + 1; 
		System.out.println(a); //a: 4
		
		a /= 2; // a = a / 2;
		System.out.println(a); //a: 2
		
		a *= a; // a = a * a;
		System.out.println(a); //a: 4
	}
}







