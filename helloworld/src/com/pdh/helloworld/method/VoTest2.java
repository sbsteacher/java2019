package com.pdh.helloworld.method;

public class VoTest2 {

	public static void main(String[] args) {
		Vo v = new Vo();
		v.num = 10;
		v.num2 = 20;
		v.str = "안녕";
		
		v = change(v);
		
		System.out.println("v.num : " + v.num);
		System.out.println("v.num2 : " + v.num2);
		System.out.println("v.str : " + v.str);
	}
	
	public static Vo change(Vo v2) {
		Vo v = new Vo();
		v.num = 20;
		v.num2 = 30;
		v.str = "Hi";
		return v2;
	}
}

