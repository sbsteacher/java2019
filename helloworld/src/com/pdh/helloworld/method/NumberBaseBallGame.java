package com.pdh.helloworld.method;

import java.util.Scanner;

public class NumberBaseBallGame {
	public static void main(String[] args) {
		final int gameNumberCount = 3;
		
		final int[] randomArray = getRandomArray(gameNumberCount);		
		final int[] myNumberArray = new int[gameNumberCount];
	
		for(int r : randomArray) {
			System.out.print(r + ", ");
		}
		System.out.println();
	
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		while(true) {
			cnt++;
			for(int i=0; i<myNumberArray.length; i++) {
				System.out.printf("%d번째 숫자 입력 : ", (i+1));
				int value = scan.nextInt();
				myNumberArray[i] = value;
			}
			
			boolean result = isPerfect(randomArray, myNumberArray);
			if(result) {
				break;
			}
		}
		System.out.printf("-- 종료 -- (%d번 사용)", cnt);		
		scan.close();
	}
	
	//내가 스트라이크3을 했는지?
	public static boolean isPerfect(int[] rArray, int[] mArray) {
		boolean result = false;
		int s=0, b=0, len = rArray.length;
		for(int i=0; i<len; i++) {			
			for(int z=0; z<len; z++) {
				if(rArray[i] == mArray[z]) {
					if(i == z) {
						s++;
					} else {
						b++;
					}
				}
			}
		}
		if(s == len) {
			result = true;
		}
		
		System.out.printf("S: %d, B: %d, O: %d\n", s, b, (len - (s + b)));	
		
		return result;
	}
	
	//(몇개)랜덤한 숫자를 담은 배열을 리턴하는 메소드
	public static int[] getRandomArray(final int num) {
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










