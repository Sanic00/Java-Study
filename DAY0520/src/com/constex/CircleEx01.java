package com.constex;

public class CircleEx01 {
	public static void main(String[] args) {
		Circle c  = new Circle(10,"��"); // ��ü �����ϸ鼭 ���� �ʱ�ȭ (�Ű� ������ ���� �������μ� ��ü ���� ����~)
//		Circle c1  = new Circle(10,"��");
//		Circle c2  = new Circle(10,"��");
//		Circle c3  = new Circle(10,"��");
//		Circle c4  = new Circle(10,"��");
//		
		//Circle c [] = new Circle[5];
		
		
		System.out.println("���� �������� : "+c.radius+", �̰� �̸��� : "+c.name+"��");
		System.out.println("���� ���̴� : "+c.getArea()+"�Դϴ�.");
	}

}
