package com.pdh.helloworld;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[][] array = new int[4][5];		
		
		System.out.println(array.length);
		System.out.println(array[1].length);
		
		for(int i=0; i<array.length; i++) {
			
			for(int z=0; z<array[i].length; z++) {
				System.out.printf("array[%d][%d] = %d\n", i, z, array[i][z]);
			}
		}
	}
}
