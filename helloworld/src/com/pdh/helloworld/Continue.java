package com.pdh.helloworld;

import java.util.Scanner;

public class Continue {
	public static void main(String[] args) {
		int money = 10000;
		System.out.printf("���� ���� ���� %,d�Դϴ�\n", money);		
		Scanner scan = new Scanner(System.in);		
		while(true) {
			System.out.print("�󸶸� ����Ͻðڽ��ϱ�? ");
			int price = scan.nextInt();
			
			if(!(price > 0 && price <= money)) {
				System.out.println("�ٽ� �Է��� �ּ���. (��� ������ Ʋ�Ƚ��ϴ�.)");
				continue;
			}
			
			money -= price;
			System.out.printf("���� ���� ���� %,d�Դϴ�\n", money);
			if(money == 0) {
				break;
			}
		}
		System.out.println("��� ���� ����Ͽ����ϴ�.");
		scan.close();
	}
}
