package com.methodex;

/*
 * ���� ���� ȣ��(call by value)
 * �޼ҵ� ȣ��� �⺻ �ڷ����� ���� ����(�Ű�����)�� �����ϴ� ���
 * 
 */
public class ValueParameter {

	public int increase(int n) {
		++n;
		return n;
	}
	
	public static void main(String[] args) {
		int value = 100; //�⺻ �ڷ����� �Ѱ���. �ڷ������� Ȱ���ϴ� ������ �Ѱ���.
		ValueParameter vp = new ValueParameter();
		int value2 = vp.increase(value); //�⺻ �ڷ����� ���� �Ѿ. (101�� ���)--->�޼ҵ� ȣ�� �� �⺻�ڷ����� ���ڰ����� ����. (Call by Value)
		System.out.println("value : "+value+", value2 : "+value2);
	}

	
	
}