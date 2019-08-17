package com.pdh.helloworld;

public class IfSentence {
	                        //매개변수, 파라미터(Parameter)
	public static void main(String[] args) {
		if(10 < 5) {
			//실행이 됨
			System.out.println("10은 5보다 작습니다.");
		}
		
		int a = 3;
		if(a >= 5) {
			System.out.println("a는 5보다 큽니다.");
		} else {
			System.out.println("a는 5보다 작습니다.");
		}
		
		int score = 49;
		
		if(score < 50) { //-무한대 ~ 49
			System.out.println("F 학점");
		
		} else if(score < 60) { //50 ~ 59
			System.out.println("D 학점");
		
		} else if(score < 70) {
			System.out.println("C 학점");
		
		} else if(score < 80) {
			System.out.println("B 학점");
			
		} else {
			System.out.println("A 학점");
		}
		
		
		System.out.println("-끝-");
	}
}






