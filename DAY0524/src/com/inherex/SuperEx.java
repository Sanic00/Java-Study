package com.inherex;

class Super{ // �θ�Ŭ���� / ù���� ������ �빮�ڷ� ! 
	int a = 5;  // �θ�Ŭ���� ��� ����
	
	public Super(int x) {
		System.out.println("�θ�Ŭ���� ������ : "+x);
	}

}

class Sub extends Super {
	
	int a = 10 ; //�ڽİ� �θ��� ������ �Ȱ���

	public Sub() {
		super(5);
		System.out.println("�ڽ� Ŭ������ ������");
	}
	
	public void test() {
	//�θ� ������ �ڽ� ������ �Ȱ��� ��, �����ϴ� ���. (this / super)
	System.out.println(this.a); // this / �ڽ� ���� �� ��� 
	System.out.println(super.a); // super / �θ� ���� �� ���
	
	}

}


public class SuperEx {

	public static void main(String[] args) {

		Sub s = new Sub();
		s.test();
	}

}
