package com.pdh.helloworld;

public class ThreeOperator {
	public static void main(String[] args) {
		int age = 17;
		
		//boolean result = age > 19;
		//System.out.println(result);
		System.out.println( (age > 19 ? "성인입니다" : "청소년입니다.") );
		
		if(age > 19) {
			System.out.println("성인입니다.");			
		} else {
			System.out.println("청소년입니다.");
		}
		
		// (A ? B : C)
		// A: 조건식
		// B: 조건식이 true일때 사용
		// C: 조건식이 false일때 사용
	}
}
