package com.pdh.helloworld;

public class Switch {
	public static void main(String[] args) {
		
		int value = 10;
		
		switch(value) {
		case 8 : 
			System.out.println("8입니다.");
				
		case 9 : 
			System.out.println("9입니다.");
			break;	
		case 10 :
			System.out.println("10입니다.");
					
		default:
			System.out.println("???");
			
		}
	}
}
