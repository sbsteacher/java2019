package com.pdh.helloworld;

public class Exam14 {
	public static void main(String[] args) {
		//������ �迭 (30�� ������ �� �ִ�) ����ð�
		//0�� �濡 5, �״����� ���ʹ� +1
		//������ sum�� ���
		//��հ� ���
		
		int[] array = new int[30];
		
		int num = 5;
		for(int i=0; i<array.length; i++) {			
			array[i] = num++;
		}
		
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + (double)sum / array.length);
		
	}
}






