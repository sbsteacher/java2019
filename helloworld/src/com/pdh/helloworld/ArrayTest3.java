package com.pdh.helloworld;

public class ArrayTest3 {
	public static void main(String[] args) {
		String[] arr = {"Java", "Hello", "Programming"};
		/*
		String[] arr = new String[3];
		arr[0] = "Java";
		arr[1] = "Hello";
		arr[2] = "Programming";
		*/
		for(String item : arr) {
			System.out.println(item);
		}
		
		System.out.println("------------------------------");
		
		int[] arr2 = {1, 2, 3, 4, 5};
		arr2[2] = 10;
		for(int item : arr2) {			
			System.out.println(item);
		}
		
	}
}










