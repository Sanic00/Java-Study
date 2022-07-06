package com.constex;

public class CircleEx02 {
	
	int radius ;
	
	void set(int r) // set이라는 메소드를 이용하여 초기화
	{ 
		radius = r;
	}
	
	// 생성자가 1개라도 존재하게 된다면, 기본 생성자를 별도로 만들어줘야함.
	
	public CircleEx02() {
	}
	
	// 하단은 매개변수를 가진 생성자
	public CircleEx02(int r) {
	radius = r;
	//this.radius = 1;
	//System.out.println(this.radius);
	}
	
	
	public static void main(String[] args) {
		CircleEx02 ce  = new CircleEx02();
		
		
	}

}
