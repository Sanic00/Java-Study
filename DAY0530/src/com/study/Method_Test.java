package com.study;

public class Method_Test {
	
	public  void showHi() {
		System.out.println("HI ~������!");
		// static�� ������ ��ü ���� �� �ʿ� ����! ��� ���� ������ �ְڴ�.
		// void �� ������ return �� ����
	}
	
	// ���� ���� �޼ҵ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static�� �پ��ٸ� ���� �޼ҵ� ȣ�� 
		// showHi(); // �޼ҵ� ȣ��!
		// ���� static�� �Ⱥپ���. �׷� ��ü�� ������־�� �Ѵ�.!
		new 	Method_Test ().showHi(); // �޼ҵ� ȣ�� 

	}

}
