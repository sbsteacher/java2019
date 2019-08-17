package com.pdh.helloworld;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //객체화
		
		System.out.print("성별을 입력해 주세요:");
		String sex = scan.next();
		

		if(sex.equals("남자")) {
			System.out.println("101호로 가세요");
			
		} else if(sex.equals("여자")) {
			System.out.println("201호로 가세요");
			
		} else {
			System.out.println("잘 못 오셨습니다.");
		}
		scan.close();
		
		//성별이 "남자"면 "101호로 가세요"
		//성별이 "여자"면 "201호로 가세요"
		//"남자"도 "여자"도 아니면 "잘 못 오셨습니다."
	}
}






