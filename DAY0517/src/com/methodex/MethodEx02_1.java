package com.methodex;

public class MethodEx02_1 {

	public static void X() {
		for(int a = 0 ; a<5 ; a++) {
			System.out.print("*");
		}
		return ; 
		//결과형 return 값이 void일 경우 return문은 생략 가능하다.
	}
	
	
	
	public static void main(String[] args) {
		
		//a매소드 호출
		X();
		System.out.println("\nHello");
		X();
		System.out.println("\nJava");
		X();
		System.out.println("\n!!!!!");
		
	
		
	}

}
