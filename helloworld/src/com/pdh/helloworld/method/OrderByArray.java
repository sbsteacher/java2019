package com.pdh.helloworld.method;

import java.util.Arrays;

public class OrderByArray {
	public static void main(String[] args) {
		int[] array = {15, 12, 9, 6, 11, 15, 18, 19};
		//orderBy(array);
		Arrays.sort(array);
		
		printArray(array);
	}
	
	
	
	//선택정렬
	public static void orderBy(int[] arr) {
		for(int i=0; i<(arr.length - 1); i++) {
			for(int z=i+1; z<arr.length; z++) {				
				if(arr[i] > arr[z]) {
					int temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
		}
	}
	
	//프린트 (7, 8)
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {			
			System.out.print(arr[i]);
			
			if(i < (arr.length - 1)) {
				System.out.print(", ");
			}
		}
	}
	
}
