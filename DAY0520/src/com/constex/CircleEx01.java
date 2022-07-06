package com.constex;

public class CircleEx01 {
	public static void main(String[] args) {
		Circle c  = new Circle(10,"원"); // 객체 생성하면서 동시 초기화 (매개 변수에 값을 넣음으로서 객체 생성 가능~)
//		Circle c1  = new Circle(10,"원");
//		Circle c2  = new Circle(10,"원");
//		Circle c3  = new Circle(10,"원");
//		Circle c4  = new Circle(10,"원");
//		
		//Circle c [] = new Circle[5];
		
		
		System.out.println("원의 반지름은 : "+c.radius+", 이고 이름은 : "+c.name+"임");
		System.out.println("원의 넓이는 : "+c.getArea()+"입니다.");
	}

}
