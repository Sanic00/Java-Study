package com.ex03;

public class Circle {

	int radius ;//���� ������ �ʵ�
	String name ;// ���� �̸� �ʵ�
	
	public Circle() {}
	
	public double getArea() {//���� ������ ���ϴ� �޼ҵ�
		return radius*radius*3.14 ;
	}
	
	public double getLength() {
		return radius * 2 * 3.14 ;
	}
	
}