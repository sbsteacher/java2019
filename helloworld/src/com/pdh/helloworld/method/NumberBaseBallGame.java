package com.pdh.helloworld.method;

import java.util.Scanner;

public class NumberBaseBallGame {
	public static void main(String[] args) {
		final int gameNumberCount = 3;
		
		final int[] randomArray = getRandomArray(gameNumberCount);		
		final int[] myNumberArray = new int[gameNumberCount];
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			for(int i=0; i<myNumberArray.length; i++) {
				System.out.printf("%d번째 숫자 입력 : ", (i+1));
				int value = scan.nextInt();
				myNumberArray[i] = value;
			}
			
			if(true) {
				break;
			}
		}
		System.out.println("-- 종료 --");		
		scan.close();
	}
	
	public static int[] getRandomArray(int num) {
		int[] array = new int[num];		
		
		for(int i=0; i<array.length; i++) {
			int randomValue = (int)(Math.random() * 9) + 1;  //6
			
			for(int z=0; z<array.length; z++) {
				if(array[z] == 0) {
					array[z] = randomValue;
					break;
				} else if(randomValue == array[z]) {
					i--;
					break;
				}
			}			
		}
		
		return array;
	}
}










