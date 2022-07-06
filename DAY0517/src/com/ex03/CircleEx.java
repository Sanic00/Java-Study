package com.ex03;

public class CircleEx {
	
	public static void main(String[]ar)  {

		Circle pizza;//참조변수(레퍼런스 변수) 선언

		pizza = new Circle(); //객체 생성

		pizza.radius = 10;//피자의 반지름을 10으로 설정
		pizza.name = "자바피자";
		
		//피자 크기 구하기(면적)
		double area = pizza.getArea();
		double length = pizza.getLength();
		System.out.println(pizza.name+"의 면적은 : "+area);
		System.out.println(pizza.name+"의 길이는 : "+length);
		
		Circle donut = new Circle();
		donut.radius=2;//도넛의 반지름을 2로 설정
		donut.name="자바도넛";
		
		area = donut.getArea();
		length = donut.getLength();
		
		System.out.println(donut.name+"의 면적은 : "+area);
		System.out.println(donut.name+"의 길이는 : "+length);
		
		
		
	}
}