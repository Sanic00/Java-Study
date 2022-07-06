package com.poly;

public class Tiger extends Animal {
	
	private String name ;
	
	public Tiger() {
		name  = getClass().getSimpleName(); //클래스의 메소드 네임을 return해주는 함수
	}
	@Override
	public String scream() {
		return "어흥 어흥 ~~~" ;
	}
	public String getName() {
		return name;
	}
	
}


