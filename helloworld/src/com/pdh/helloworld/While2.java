package com.pdh.helloworld;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.print("음악을 재생하시겠습니까? (Y or N) : ");
			String answer = scan.next();
			
			if(!answer.equals("Y")) {
				break;
			}
			System.out.printf("음악을 %d번 재생했습니다.\n", ++count);
		}
		System.out.println("-- 재생 종료 --");
		scan.close();
	}
}