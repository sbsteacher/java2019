package com.pdh.helloworld;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		//switch, 특징을 이용하여 만들어야 함
		//월을 입력받는다.(int형)(String형 상관없음)
		//입력받은 월 값이 1~3 "겨울입니다."
		//  "        4~6 "봄입니다."
		//  "        7~9 "여름입니다."
		//  "        10~12 "가을입니다."
		//1~12 가 아닌 값이 들어오면 "잘 못 입력하셨습니다."
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		String month = scan.next();
		
		switch(month) {		
		case "1": case "2": case "3":
			System.out.println("겨울입니다.");
			break;
		case "4": case "5": case "6":
			System.out.println("봄입니다.");
			break;
		case "7": case "8": case "9":
			System.out.println("여름입니다.");
			break;
		case "10": case "11": case "12":
			System.out.println("가을입니다.");
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
			break;
		}
		scan.close();
	}
}









