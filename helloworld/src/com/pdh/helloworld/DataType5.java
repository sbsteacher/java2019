package com.pdh.helloworld;

public class DataType5 {
	public static void main(String[] args) {
		byte a = 127;		
		System.out.println("a : " +  a);
		int b = a;
		System.out.println("b : " + b);
		
		float c = b;
		System.out.println("c : " + c);
		
		System.out.println("-----------------------");
		
		int b2 = 200;
		byte a2 = (byte)b2;
		System.out.println("b2 : " + b2);
		System.out.println("a2 : " + a2);
	}
}







