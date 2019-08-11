package com.pdh.helloworld;

public class DataType {
	
	public static void main(String[] aaa) {
		int a = 10;
		long l = 200000000000000000L;
		
		//실수형
		float f = 10.4f;
		double d = 10.4d;
		
		d = f; //자동형변환		
		f = (float)d; //강제형변환
	}
}
