package com.pdh.helloworld;

public class LogicOperator2 {
	public static void main(String[] args) {
		
		// && ��� true > true
		// true && true && true => true
		// true && false && true => false;
		
		//|| �ϳ��� true�� �ִٸ� true�Ǵ°� ||
		//false�� �Ƿ��� ���� false���߸� �Ѵ�.
		
		
		int a = 10;
		System.out.println(!(5 < a && a < 15));
		System.out.println((5 < a && a < 15) && a%2 == 0);
				
		a = 4;
		System.out.println((5 < a && a < 15) && a%2 == 0);
		System.out.println((5 < a && a < 15) || a%2 == 0);
	}
}








