package com.methodex;

public class OverloadingEx02 {
//�Լ��� �̸��� ������, �Ű������� �ڷ����� �ٸ��� .= >�����ε�
	
	public void getLength(int n) {
		String s = String.valueOf(n); //"4"
		getLength(s);
	}
	/*
	public void getLength(int n , int n1) { // �Ű������� ������ �޶� �ȴ�.
	}
	public void getLength(long n, int n1 , int n2) { // �Ű������� �ڷ���+������ �޶� �ȴ�.
	}
	*/
	void getLength(float n) {
		String s = String.valueOf(n);
		getLength(s);
		
	}
	private int getLength(String str) {
		System.out.println("�Է��� ���� ����: "+str.length());
		return 0 ;
	}
	
	//������ ���� ���� : Ŭ���� ������ �ʱ�ȭ.
	public static void main(String[] args) {
		
		OverloadingEx02 oe2 = new OverloadingEx02();
		oe2.getLength(1000); //int�� ã�ư�
		oe2.getLength(3.14f);
		oe2.getLength("100000");
	}

}
