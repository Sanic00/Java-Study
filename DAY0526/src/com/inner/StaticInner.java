package com.inner;

import com.inner.StaticInner.Inner;

/*
 * static 이너 클래스 
 * 
 * -static 이너 클래스로 어쩔 수 없이 정의하는 경우가 있는데
 *  어쩔 수 없이 정의하는 경우란 이너클래스 내에 static 변수를 가지고 있을 경우
 *  어쩔 수 없이 해당 이너클래스는 static으로 선언해야함.
 *  
 *  
 *  이너 클래스의 지정어로 static을 기재해야 함.
 *  	
 *  	형식
 *  
 *  	class Outer{
 *  
 *  	int aa ;
 *  	
 *  	static class Inner { // static 이너 클래스로 정의해야만,
 *  	static int bb ;	 // 이너 클래스 내에 static 변수를 가질 수 있음
 *  	
 *  	 }
 *  	}
 *  
 * 		Outer.Inner in = new Outer.Inner(); 
 * 		Outer.Inner in = new Outer().new Inner();
 * 
 */

public class StaticInner {

	int a = 10;
	private int b = 100 ;
	static int c = 200 ;
	
	static class Inner {
		static int d = 1000 ;
	
	public void printData() {
		//System.out.println("int a :"+a);
		//System.out.println("int b :"+b);
		System.out.println("int c :"+c);
		System.out.println("int d :"+d);
	
	}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInner.Inner in = new StaticInner.Inner();
		in.printData();
	}

}
