package com.pdh.helloworld;

import java.util.Scanner;

public class Continue {
	public static void main(String[] args) {
		int money = 10000;
		System.out.printf("현재 가진 돈은 %,d입니다\n", money);		
		Scanner scan = new Scanner(System.in);		
		while(true) {
			System.out.print("얼마를 사용하시겠습니까? ");
			int price = scan.nextInt();
			
			if(!(price > 0 && price <= money)) {
				System.out.println("다시 입력해 주세요. (사용 범위가 틀렸습니다.)");
				continue;
			}
			
			money -= price;
			System.out.printf("현재 가진 돈은 %,d입니다\n", money);
			if(money == 0) {
				break;
			}
		}
		System.out.println("모든 돈을 사용하였습니다.");
		scan.close();
	}
}
