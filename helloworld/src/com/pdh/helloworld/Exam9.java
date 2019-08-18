package com.pdh.helloworld;

public class Exam9 {
	public static void main(String[] args) {
		//for문 활용하여 2단 구구단을 출력하세요!!
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// ....
		// 2 * 9 = 18
		final int DAN = 2;
		/*
		
		for(int i=5; i<=13; i++) {
			int cal = i - 4;
			System.out.printf("%d X %d = %d\n", DAN, cal, (DAN*cal));
		}
		*/
		
		for(int i=82; i<=90; i++) {	
			int cal = i - 81;
			System.out.printf("%d X %d = %d\n", DAN, cal, (DAN*cal));
		}
		
	}
}







