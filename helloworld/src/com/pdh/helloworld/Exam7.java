package com.pdh.helloworld;

public class Exam7 {
	public static void main(String[] args) {
		//switch�� �� �̿�
		//book���� 10�� �̸� "���� �� ����ϼ���"
		//10~19�� "å �д� ���� ���� ��"
		//20~29�� "å�� ����ϴ� ��"
		//30�� �̻� "����� �ٵ���"
		//case��, default ���ļ� 4�������� �ذ�!!
		
		int book = 15; //book���� �ƹ����� �� �� �ִ�.
		System.out.printf("%d / 10 = %d\n", book, (book/10));
		
		switch(book/10) {
		case 0:
			System.out.println("���� �� ����ϼ���");
			break;
		case 1:
			System.out.println("å �д� ���� ���� ��");
			break;
		case 2:
			System.out.println("å�� ����ϴ� ��");
			break;
		default:
			System.out.println("����� �ٵ���");
			break;
		}
	}
}
