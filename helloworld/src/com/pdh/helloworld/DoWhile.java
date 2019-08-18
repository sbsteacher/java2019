package com.pdh.helloworld;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;		
		int count = 0;
		do {
			System.out.print("음악을 재생하시겠습니까? (Y or N) : ");
			answer = scan.next();
			
			if(answer.equals("Y")) {
				System.out.printf("음악을 %d번 재생했습니다.\n", ++count);
			}		
		} while(answer.equals("Y"));
		System.out.println("-- 재생 종료 --");
		scan.close();
	}
}