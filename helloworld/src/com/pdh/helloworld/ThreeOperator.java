package com.pdh.helloworld;

public class ThreeOperator {
	public static void main(String[] args) {
		int age = 17;
		
		//boolean result = age > 19;
		//System.out.println(result);
		System.out.println( (age > 19 ? "�����Դϴ�" : "û�ҳ��Դϴ�.") );
		
		if(age > 19) {
			System.out.println("�����Դϴ�.");			
		} else {
			System.out.println("û�ҳ��Դϴ�.");
		}
		
		// (A ? B : C)
		// A: ���ǽ�
		// B: ���ǽ��� true�϶� ���
		// C: ���ǽ��� false�϶� ���
	}
}
