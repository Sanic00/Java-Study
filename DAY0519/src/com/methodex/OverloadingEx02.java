package com.methodex;

public class OverloadingEx02 {
//함수의 이름은 같지만, 매개변수의 자료형은 다르다 .= >오버로딩
	
	public void getLength(int n) {
		String s = String.valueOf(n); //"4"
		getLength(s);
	}
	/*
	public void getLength(int n , int n1) { // 매개변수의 갯수가 달라도 된다.
	}
	public void getLength(long n, int n1 , int n2) { // 매개변수의 자료형+갯수가 달라도 된다.
	}
	*/
	void getLength(float n) {
		String s = String.valueOf(n);
		getLength(s);
		
	}
	private int getLength(String str) {
		System.out.println("입력한 값의 길이: "+str.length());
		return 0 ;
	}
	
	//생성자 생성 이유 : 클래스 변수의 초기화.
	public static void main(String[] args) {
		
		OverloadingEx02 oe2 = new OverloadingEx02();
		oe2.getLength(1000); //int를 찾아감
		oe2.getLength(3.14f);
		oe2.getLength("100000");
	}

}
