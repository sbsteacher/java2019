package com.pdh.helloworld;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		final int STAND_MAN_HEIGHT = 173;
		final int STAND_WOMAN_HEIGHT = 161;
		
		Scanner scan = new Scanner(System.in); //��üȭ
		System.out.print("������ �Է��� �ּ��� : ");
		String sex = scan.next();
		
		System.out.print("Ű�� �Է��� �ּ��� : ");
		int height = scan.nextInt();				
		if(sex.equals("����") || sex.equals("����")) {
			int standHeight = 0;
			if(sex.equals("����")) {
				standHeight = STAND_MAN_HEIGHT;
			} else {
				standHeight = STAND_WOMAN_HEIGHT;
			}
			
			if(standHeight > height) {
				System.out.println("��� �����Դϴ�.");
			} else if(standHeight < height) {
				System.out.println("��� �̻��Դϴ�.");
			} else {
				System.out.println("����Դϴ�.");
			}			
			
		} else {
			System.out.println("�� �� �Է��ϼ̽��ϴ�.");
		}
			
		System.out.println("����");
		scan.close();

	}
}



