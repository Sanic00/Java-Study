package com.constex;
/*
 * this : ��ü �ڽ��� ����Ű�� ���۷�����(����)
 * 	
 * 		this�� �����Ϸ��� ���� �ڵ����� �����Ƿ� �����ڴ� this�� ����ϱ⸸ �ϸ� ��.
 * 
 * 
 */

class CircleEx001 {

	int radius ; // Ŭ���� ����(��������)
	// this��� �� �� �ִ°� �Ϲ� ��ü �޼ҵ�� ����� �� ���� ,���� �����ڿ����� ��밡���ϴ�.
	// �����ڿ��� �ٸ� �����ڸ� ȣ�� �� ��, this();���� �ݵ�� ù��° �ٿ� ���ƾ��Ѵ�. 
	// ȣ��Ǵ� this ���� ���� �������� �Ű������� ����ȴ�
	
	public CircleEx001() {
		this(10); //�Ű������� ������ �ִ� ������ �Լ�. �����ڿ��� �ٸ� �����ڸ� ȣ���� �� this�� ��.
	}

	public CircleEx001(int radius) {
		this(10,10); // 
		radius = radius ; //Ŭ�������� = �������� / �ڽ� Ŭ����.�ڽ��� ���� �ִ� ��ü
	}
	
	public CircleEx001(int radius, int a) {
		this(10,10,10);
		radius = radius ; 
	}

	public CircleEx001(int radius, int a, int b) {
		radius = radius ;
	}

	
	public int getRadius() {
		return radius; // Q.�� this�� �����ϳ��� ? A. �Ű������� �̸��� �����.
		//this����ϴ� ����  : ������ �����ϱ� ���ؼ�!
//		Ŭ������ ������� , �����ڰ� ������ �ִ� ���� 
		//���� 2���� : ��������(Ŭ���� ��) / ��������(�޼ҵ� ��)
		//private�������� : ���ϼ� /Ŭ���� ���������� ���� 0���� �ʱ�ȭ�Ǳ⶧���� getter/setter�̿밡��?
	}


public class ThisEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
