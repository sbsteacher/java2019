package com.pdh.helloworld;

public class IfSentence {
	                        //�Ű�����, �Ķ����(Parameter)
	public static void main(String[] args) {
		if(10 < 5) {
			//������ ��
			System.out.println("10�� 5���� �۽��ϴ�.");
		}
		
		int a = 3;
		if(a >= 5) {
			System.out.println("a�� 5���� Ů�ϴ�.");
		} else {
			System.out.println("a�� 5���� �۽��ϴ�.");
		}
		
		int score = 49;
		
		if(score < 50) { //-���Ѵ� ~ 49
			System.out.println("F ����");
		
		} else if(score < 60) { //50 ~ 59
			System.out.println("D ����");
		
		} else if(score < 70) {
			System.out.println("C ����");
		
		} else if(score < 80) {
			System.out.println("B ����");
			
		} else {
			System.out.println("A ����");
		}
		
		
		System.out.println("-��-");
	}
}






