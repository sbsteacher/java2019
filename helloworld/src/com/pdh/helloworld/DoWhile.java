package com.pdh.helloworld;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;		
		int count = 0;
		do {
			System.out.print("������ ����Ͻðڽ��ϱ�? (Y or N) : ");
			answer = scan.next();
			
			if(answer.equals("Y")) {
				System.out.printf("������ %d�� ����߽��ϴ�.\n", ++count);
			}		
		} while(answer.equals("Y"));
		System.out.println("-- ��� ���� --");
		scan.close();
	}
}