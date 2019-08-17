package com.pdh.helloworld;

import java.util.Scanner;

public class IfIf {
	public static void main(String[] args) {
		final String UID = "java";
		final String UPW = "abc123";
		//아이디 입력받을 겁니다.
		//(A)아이디가 "java"가 맞으면 "id 일치"가 나타나고,
		//아이디가 "java"가 아니면 "id 불일치"가 나타나고 프로그램 종료
		
		//(A 이후) 비밀번호 입력 받습니다.
		//비밀번호가 "abc123"이 맞으면 "비밀번호 일치" 나타나고, "로그인 성공" 나타나고 프로그램 종료
		
		//비밀번호가 다르면 "비밀번호 불일치" 나타나고 프로그램 종료
		String id, pw;		
		Scanner scan = new Scanner(System.in); 
		System.out.print("아이디 입력 : ");
		id = scan.next();
		
		if(id.equals(UID)) {
			System.out.println("id 일치\n");
			
			System.out.print("비밀번호 입력: ");			
			pw = scan.next();
			if(pw.equals(UPW)) {
				System.out.println("비밀번호 일치");
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호 불일치");
			}
			
		} else {			
			System.out.println("id 불일치");
		}
		scan.close();
		System.out.println("-종료-");
	}
}







