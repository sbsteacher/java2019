package com.pdh.helloworld;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //��üȭ
		
		System.out.print("������ �Է��� �ּ���:");
		String sex = scan.next();
		

		if(sex.equals("����")) {
			System.out.println("101ȣ�� ������");
			
		} else if(sex.equals("����")) {
			System.out.println("201ȣ�� ������");
			
		} else {
			System.out.println("�� �� ���̽��ϴ�.");
		}
		scan.close();
		
		//������ "����"�� "101ȣ�� ������"
		//������ "����"�� "201ȣ�� ������"
		//"����"�� "����"�� �ƴϸ� "�� �� ���̽��ϴ�."
	}
}






