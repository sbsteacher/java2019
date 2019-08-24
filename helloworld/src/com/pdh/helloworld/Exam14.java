package com.pdh.helloworld;

public class Exam14 {
	public static void main(String[] args) {
		//정수형 배열 (30개 저장할 수 있는) 만드시고
		//0번 방에 5, 그다음방 부터는 +1
		//모든방의 sum값 출력
		//평균값 출력
		
		int[] array = new int[30];
		
		int num = 5;
		for(int i=0; i<array.length; i++) {			
			array[i] = num++;
		}
		
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum / array.length);
		
	}
}






