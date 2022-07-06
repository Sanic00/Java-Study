package com.poly;

public class Cat extends Animal {

	private String name ;
	
	public Cat() {
		name  = getClass().getSimpleName(); //클래스의 메소드 네임을 return해주는 함수
	}
	@Override
	public String scream() {
		return "야옹 야옹 ~~~" ;
	}
	public String getName() {
		return name;
	}
	
}
