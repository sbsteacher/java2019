package com.pdh.helloworld.method;

public class NumberBaseBallGame {
	public static void main(String[] args) {
		final int gameNumberCount = 3;
		
		final int[] randomArray = getRandomArray(gameNumberCount);
		
		for(int a : randomArray) {
			System.out.println(a);
		}
	}
	
	public static int[] getRandomArray(int num) {
		int[] array = new int[num];		
		
		for(int i=0; i<array.length; i++) {
			int randomValue = (int)(Math.random() * 9) + 1;  //1~9
			
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










