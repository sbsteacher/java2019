package com.pdh.helloworld;

public class Operator2 {
	public static void main(String[] args) {
		int num1 = 10;
		//num1 = 11;
		
		//1
		//num1 = num1 + 1;
		
		//2
		//num1++;
		
		//3
		num1 += 1;
		
		System.out.println(num1);
		
		System.out.println("------------------------");
		
		int num2 = 10;
		int num3 = 10;
		
		++num2;
		num3++;
		
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
		System.out.println("------------------------");
		
		int num4 = 10;
		int num5 = 10;
		
		System.out.println("++num4 : " + (++num4));
		System.out.println("num4 : " + num4);
		
		System.out.println("num5++ : " + (num5++));
		System.out.println("num5 : " + num5);
		
	}
}





