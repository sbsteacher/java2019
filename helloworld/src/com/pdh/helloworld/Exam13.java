package com.pdh.helloworld;

public class Exam13 {
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {			
			for(int z=0; z<=i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		final int CNT = 5;
		for(int i=1; i<=CNT; i++) {	
			for(int z=0; z<CNT; z++) {
				if(z < (CNT - i)){
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		for(int i=1; i<=CNT; i++) {
			int z=0;
			for(; z<(CNT - i); z++) {
				System.out.print(" ");
			}
			for(; z<CNT; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
