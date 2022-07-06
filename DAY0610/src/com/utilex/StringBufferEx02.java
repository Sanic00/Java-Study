package com.utilex;

public class StringBufferEx02 {
	/*
	 * String Buffer Ŭ����
	 * 
	 * (���۶� : �ӽ� ���� ����. �ӽ� ������ Ȱ���� ����, ������ ����������.)
	 * ������ ������ ���� �Ͼ�� ��쿡 ���
	 * �� Ŭ������ ��ü�� ũ�Ⱑ �����ε�, ��ü �����ñ⸦ �������� �ʾ� �⺻������ 16���� ���ڸ� ������ �� �ִ� ���� ������ ������.
	 * String Ŭ������ ��ü�� �� �� �����Ǹ� �� ������ ������ ������
	 * StringBuffer Ŭ������ ��ü�� ���ڿ��� ������ ������ �� �ִ�.
	 * �޼��� ���� Ÿ���� void.
	 */	
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1234567890");
	
		System.out.println(sb.capacity());//16+10
		System.out.println(sb.length());//10
		sb.append("ABCDEFGHIJKLMNOPQ");
		System.out.println(sb.capacity());//54
		System.out.println(sb.length());//10+17
		sb.delete(1, 20);
		//�ȿ� �ִ� �����͸� ���� �� ������, ���۴� �ѹ� �þ�� �پ���� �ʴ´�.
		System.out.println(sb.capacity());//54
		System.out.println(sb.length());//8
//��� : ","�� �и��� ���ڿ�		
//st.next Token() : ���� ����� �����´�.
	
	}
}
