package com.constex;

public class CircleEx02 {
	
	int radius ;
	
	void set(int r) // set�̶�� �޼ҵ带 �̿��Ͽ� �ʱ�ȭ
	{ 
		radius = r;
	}
	
	// �����ڰ� 1���� �����ϰ� �ȴٸ�, �⺻ �����ڸ� ������ ����������.
	
	public CircleEx02() {
	}
	
	// �ϴ��� �Ű������� ���� ������
	public CircleEx02(int r) {
	radius = r;
	//this.radius = 1;
	//System.out.println(this.radius);
	}
	
	
	public static void main(String[] args) {
		CircleEx02 ce  = new CircleEx02();
		
		
	}

}
