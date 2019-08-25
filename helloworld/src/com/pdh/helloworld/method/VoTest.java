package com.pdh.helloworld.method;

public class VoTest {
	public static void main(String[] args) {
		int num = 10;		
		Vo v = new Vo();		
		v.num = 10;
		String s = "Hi"; // String s = new String("Hi");
		
		System.out.println("num : " + num);
		System.out.println("v.num : " + v.num);
		System.out.println("s : " + s);
		
		cvNormal(num);
		cvRef(v);
		cvString(s);
		System.out.println("-------------");		
		System.out.println("num : " + num);
		System.out.println("v.num : " + v.num);
		System.out.println("s : " + s);
	}
	
	public static void cvNormal(int n) {
		n = 20;
	}
	
	public static void cvRef(Vo v) {
		v.num = 20;
		
	}
	
	public static void cvString(String s) {		
		s = "안녕"; // s = new String("안녕");
	}	
}








