package com.pdh.helloworld;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.print("������ ����Ͻðڽ��ϱ�? (Y or N) : ");
			String answer = scan.next();
			
			if(!answer.equals("Y")) {
				break;
			}
			System.out.printf("������ %d�� ����߽��ϴ�.\n", ++count);
		}
		System.out.println("-- ��� ���� --");
		scan.close();
	}
}