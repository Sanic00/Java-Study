package com.poly;

public class Cat extends Animal {

	private String name ;
	
	public Cat() {
		name  = getClass().getSimpleName(); //Ŭ������ �޼ҵ� ������ return���ִ� �Լ�
	}
	@Override
	public String scream() {
		return "�߿� �߿� ~~~" ;
	}
	public String getName() {
		return name;
	}
	
}
