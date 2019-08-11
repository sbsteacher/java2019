package com.pdh.helloworld;

public class LogicOperator2 {
	public static void main(String[] args) {
		
		// && 모두 true > true
		// true && true && true => true
		// true && false && true => false;
		
		//|| 하나라도 true가 있다면 true되는게 ||
		//false가 되려면 전부 false여야만 한다.
		
		
		int a = 10;
		System.out.println(!(5 < a && a < 15));
		System.out.println((5 < a && a < 15) && a%2 == 0);
				
		a = 4;
		System.out.println((5 < a && a < 15) && a%2 == 0);
		System.out.println((5 < a && a < 15) || a%2 == 0);
	}
}








