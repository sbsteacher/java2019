package com.pdh.helloworld;

public class Exam10 {
	public static void main(String[] args) {
		//2 ~ 9 단 구구단 출력
		//2 x 1 = 2
		//2 x 2 = 4
		//...
		//2 x 9 = 18
		//3 x 1 = 3
		//3 x 2 = 6
		//....
		//9 x 9 = 81
		
		for(int z=5; z<=12; z++) {
			for(int i=3; i<=11; i++) {
				System.out.printf("%d x %d = %d\n", (z-3), (i-2), ((z-3)*(i-2)));				
			}
			System.out.println();
		}
		
		
	}
}
