package com.pdh.helloworld;

import java.util.Scanner;

public class IfIf {
	public static void main(String[] args) {
		final String UID = "java";
		final String UPW = "abc123";
		//���̵� �Է¹��� �̴ϴ�.
		//(A)���̵� "java"�� ������ "id ��ġ"�� ��Ÿ����,
		//���̵� "java"�� �ƴϸ� "id ����ġ"�� ��Ÿ���� ���α׷� ����
		
		//(A ����) ��й�ȣ �Է� �޽��ϴ�.
		//��й�ȣ�� "abc123"�� ������ "��й�ȣ ��ġ" ��Ÿ����, "�α��� ����" ��Ÿ���� ���α׷� ����
		
		//��й�ȣ�� �ٸ��� "��й�ȣ ����ġ" ��Ÿ���� ���α׷� ����
		String id, pw;		
		Scanner scan = new Scanner(System.in); 
		System.out.print("���̵� �Է� : ");
		id = scan.next();
		
		if(id.equals(UID)) {
			System.out.println("id ��ġ\n");
			
			System.out.print("��й�ȣ �Է�: ");			
			pw = scan.next();
			if(pw.equals(UPW)) {
				System.out.println("��й�ȣ ��ġ");
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ ����ġ");
			}
			
		} else {			
			System.out.println("id ����ġ");
		}
		scan.close();
		System.out.println("-����-");
	}
}







