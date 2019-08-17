package com.pdh.helloworld;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		final int STAND_MAN_HEIGHT = 173;
		final int STAND_WOMAN_HEIGHT = 161;
		
		Scanner scan = new Scanner(System.in); //객체화
		System.out.print("성별을 입력해 주세요 : ");
		String sex = scan.next();
		
		System.out.print("키를 입력해 주세요 : ");
		int height = scan.nextInt();				
		if(sex.equals("남자") || sex.equals("여자")) {
			int standHeight = 0;
			if(sex.equals("남자")) {
				standHeight = STAND_MAN_HEIGHT;
			} else {
				standHeight = STAND_WOMAN_HEIGHT;
			}
			
			if(standHeight > height) {
				System.out.println("평균 이하입니다.");
			} else if(standHeight < height) {
				System.out.println("평균 이상입니다.");
			} else {
				System.out.println("평균입니다.");
			}			
			
		} else {
			System.out.println("잘 못 입력하셨습니다.");
		}
			
		System.out.println("종료");
		scan.close();

	}
}



