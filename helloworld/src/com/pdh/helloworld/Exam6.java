package com.pdh.helloworld;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		//switch, Ư¡�� �̿��Ͽ� ������ ��
		//���� �Է¹޴´�.(int��)(String�� �������)
		//�Է¹��� �� ���� 1~3 "�ܿ��Դϴ�."
		//  "        4~6 "���Դϴ�."
		//  "        7~9 "�����Դϴ�."
		//  "        10~12 "�����Դϴ�."
		//1~12 �� �ƴ� ���� ������ "�� �� �Է��ϼ̽��ϴ�."
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		String month = scan.next();
		
		switch(month) {		
		case "1": case "2": case "3":
			System.out.println("�ܿ��Դϴ�.");
			break;
		case "4": case "5": case "6":
			System.out.println("���Դϴ�.");
			break;
		case "7": case "8": case "9":
			System.out.println("�����Դϴ�.");
			break;
		case "10": case "11": case "12":
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("�� �� �Է��ϼ̽��ϴ�.");
			break;
		}
		scan.close();
	}
}









