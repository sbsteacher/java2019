package com.pdh.helloworld;

public class DataType4 {
	public static void main(String[] args) {				
		boolean b = true;
		boolean b2 = false;
		
		if(b) {
			System.out.println("참이다");
		}
		
		if(b2) {
			System.out.println("거짓이다");
		}
		
		System.out.println("b : " + b);
		System.out.println("!b : " + !b);
		System.out.println("b2 : " + b2);
		System.out.println("!b2 : " + !b2);
		
		boolean flag = true;
		
		flag = !flag;
		System.out.println(flag);
		
		flag = !flag;
		System.out.println(flag);
		
		flag = !flag;
		System.out.println(flag);
		
		flag = !flag;
		System.out.println(flag);
	}
}








