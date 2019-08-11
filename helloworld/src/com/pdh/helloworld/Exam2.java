package com.pdh.helloworld;

public class Exam2 {
	public static void main(String[] args) {
		
		//문자열 변수 1 "안녕하세요" 이 저장되어 있다.
		//문자열 변수 2 "조심히 가세요" 가 저장되어 있다.
		//문자열 변수 3 본인 이름이 저장되어 있습니다. 
		
		//System.out.printf와 문자열 변수 3개를 이용하여
		//e.g. 안녕하세요 박도흠입니다. 조심히 가세요
		//가 찍히도록 프로그래밍 해보세요.
		
		
		String str1 = "안녕하세요";
		String str2 = "조심히 가세요";
		String name = "박도흠";
		
		System.out.printf("%s %s입니다. %s\n", str1, name, str2);
	}
}










