package com.ex03;

public class CircleEx {
	
	public static void main(String[]ar)  {

		Circle pizza;//��������(���۷��� ����) ����

		pizza = new Circle(); //��ü ����

		pizza.radius = 10;//������ �������� 10���� ����
		pizza.name = "�ڹ�����";
		
		//���� ũ�� ���ϱ�(����)
		double area = pizza.getArea();
		double length = pizza.getLength();
		System.out.println(pizza.name+"�� ������ : "+area);
		System.out.println(pizza.name+"�� ���̴� : "+length);
		
		Circle donut = new Circle();
		donut.radius=2;//������ �������� 2�� ����
		donut.name="�ڹٵ���";
		
		area = donut.getArea();
		length = donut.getLength();
		
		System.out.println(donut.name+"�� ������ : "+area);
		System.out.println(donut.name+"�� ���̴� : "+length);
		
		
		
	}
}