package com.pdh.helloworld;

public class ArrayTest {

	public static void main(String[] args) {
		String[] array2 = new String[20];
		array2[0] = new String("¾È³ç");
		array2[1] = new String("¾È³ç");
		
		
		HelloWorld hw = new HelloWorld();
		HelloWorld hw2 = new HelloWorld();
		
		System.out.println(array2[0].hashCode());
		System.out.println(array2[1].hashCode());
		System.out.println(array2[0] == array2[1]);
		
		
		System.out.println(array2[0]);
		/*
		
		int[] array = new int[50]; //A
		/*
		for(int i=0; i<array.length; i++) {
			array[i] = (i * 2);
		}
		/*		
		//array[0] = 0;
		//array[1] = 2;
		//array[2] = 4;
		//....
		//array[29] = 29*2;	
		
		for(int i=0; i<array2.length; i++) {
			System.out.printf("array2[%d] = %d\n", i, array2[i]);
		}
		*/
	}

}








