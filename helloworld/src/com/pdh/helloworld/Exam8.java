package com.pdh.helloworld;

public class Exam8 {
	public static void main(String[] args) {
		//switch를 꼭 이용
		//book값이 10권 이하 "조금 더 노력하세요"
		//11~20권 "책 읽는 것을 즐기는 분"
		//21~30권 "책을 사랑하는 분"
		//30권 초과 "당신은 다독왕"
		//case문, default 합쳐서 4개만으로 해결!!
		
		int book = 31; //book값은 아무값이 들어갈 수 있다.
		System.out.printf("%d / 10 = %d\n", book, (book/10));
		
		switch((book - 1)/10) {
		case 0:
			System.out.println("조금 더 노력하세요");
			break;
		case 1:
			System.out.println("책 읽는 것을 즐기는 분");
			break;
		case 2:
			System.out.println("책을 사랑하는 분");
			break;
		default:
			System.out.println("당신은 다독왕");
			break;
		}
	}
}
