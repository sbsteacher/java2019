package com.pdh.helloworld;

public class Exam8 {
	public static void main(String[] args) {
		//switch�� �� �̿�
		//book���� 10�� ���� "���� �� ����ϼ���"
		//11~20�� "å �д� ���� ���� ��"
		//21~30�� "å�� ����ϴ� ��"
		//30�� �ʰ� "����� �ٵ���"
		//case��, default ���ļ� 4�������� �ذ�!!
		
		int book = 31; //book���� �ƹ����� �� �� �ִ�.
		System.out.printf("%d / 10 = %d\n", book, (book/10));
		
		switch((book - 1)/10) {
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
