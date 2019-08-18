package com.pdh.helloworld;

public class Exam12 {
	public static void main(String[] args) {
		for(int z=1; z<=25; z++) {
			System.out.print("*");
			if(z % 5 == 0) {
				System.out.println();	
			}
		}		
		
		for(int z=0; z<5; z++) {
			for(int i=0; i<5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
