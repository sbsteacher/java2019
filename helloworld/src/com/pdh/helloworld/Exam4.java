package com.pdh.helloworld;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		//����, Ű ���� �Է¹����ð�
		//������ "����"���� �� ��� Ű�� ������ 173.
		//������ "����"���� �� ��� Ű�� ������ 161.
		//��� Ű�� ���� ������ "��� �����Դϴ�"
		//��� Ű���̸� "����Դϴ�."
		//��� Ű�� ���� ũ�� "��� �̻��Դϴ�."
		//���� ���� "����", "����"�� �ƴ϶�� "�� �� �Է��ϼ̽��ϴ�."
		
		final int STAND_MAN_HEIGHT = 173;
		final int STAND_WOMAN_HEIGHT = 161;
		
		Scanner scan = new Scanner(System.in); //��üȭ
		System.out.print("������ �Է��� �ּ��� : ");
		String sex = scan.next();
		//System.out.println("sex : " + sex);
		
		System.out.print("Ű�� �Է��� �ּ��� : ");
		int height = scan.nextInt(); 
		//System.out.println("height : " + height);
				
		if(sex.equals("����")) {			
			if(STAND_MAN_HEIGHT > height) {
				System.out.println("��� �����Դϴ�.");
			} else if(STAND_MAN_HEIGHT < height) {
				System.out.println("��� �̻��Դϴ�.");
			} else {
				System.out.println("����Դϴ�.");
			}	
		} else if(sex.equals("����")) {			
			if(STAND_WOMAN_HEIGHT > height) {
				System.out.println("��� �����Դϴ�.");
			} else if(STAND_WOMAN_HEIGHT < height) {
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
