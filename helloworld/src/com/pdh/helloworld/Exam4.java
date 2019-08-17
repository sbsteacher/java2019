package com.pdh.helloworld;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		//성별, 키 값을 입력받으시고
		//성별이 "남자"였을 때 평균 키값 기준은 173.
		//성별이 "여자"였을 때 평균 키값 기준은 161.
		//평균 키값 보다 작으면 "평균 이하입니다"
		//평균 키값이면 "평균입니다."
		//평균 키값 보다 크면 "평균 이상입니다."
		//성별 값이 "남자", "여자"가 아니라면 "잘 못 입력하셨습니다."
		
		final int STAND_MAN_HEIGHT = 173;
		final int STAND_WOMAN_HEIGHT = 161;
		
		Scanner scan = new Scanner(System.in); //객체화
		System.out.print("성별을 입력해 주세요 : ");
		String sex = scan.next();
		//System.out.println("sex : " + sex);
		
		System.out.print("키를 입력해 주세요 : ");
		int height = scan.nextInt(); 
		//System.out.println("height : " + height);
				
		if(sex.equals("남자")) {			
			if(STAND_MAN_HEIGHT > height) {
				System.out.println("평균 이하입니다.");
			} else if(STAND_MAN_HEIGHT < height) {
				System.out.println("평균 이상입니다.");
			} else {
				System.out.println("평균입니다.");
			}	
		} else if(sex.equals("여자")) {			
			if(STAND_WOMAN_HEIGHT > height) {
				System.out.println("평균 이하입니다.");
			} else if(STAND_WOMAN_HEIGHT < height) {
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
