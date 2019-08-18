package com.pdh.helloworld;

public class Exam11 {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {			
			for(int z=2; z<=9; z++) {
				System.out.printf("%d x %d = %d\t", z, i, (z*i));				
			}
			System.out.println();
		}
	}
}
