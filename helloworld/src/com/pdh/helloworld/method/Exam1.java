package com.pdh.helloworld.method;

public class Exam1 {
	public static void main(String[] args) {
		gugudan(7);
		
		gugudan(10);
	}

	public static void gugudan(int num) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
		}
		System.out.println();
		
	}

}





//7 * 1 = 7
//7 * 2 = 14
//...
//7 * 9 = 63