package com.poly;

public class Dog extends Animal{
	
	private String name ;
	
	public Dog() {
		name  = getClass().getSimpleName(); //클래스의 메소드 네임을 return해주는 함수
	}
	@Override
	public String scream() {
		return "멍 멍 멍~~~" ;
	}
	public String getName() {
		return name;
	}
}
