package com.poly;

public class Dog extends Animal{
	
	private String name ;
	
	public Dog() {
		name  = getClass().getSimpleName(); //Ŭ������ �޼ҵ� ������ return���ִ� �Լ�
	}
	@Override
	public String scream() {
		return "�� �� ��~~~" ;
	}
	public String getName() {
		return name;
	}
}
