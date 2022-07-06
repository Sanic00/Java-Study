package com.utilex;

/*
 * String class 
 * -���ڿ��� �ǹ��ϴ� Ŭ����
 * -��ü �ڷ���������, �⺻�ڷ���ó�� �����.
 * 
 * ������ 
 * String() : ����ִ� ���ڿ� ��ü�� �����ϰ� �ʱ�ȭ.
 * String(char[] value) : ������ char�迭 ���� ������ ���������� �����Ͽ� ���ο� ���ڿ��� ������.
 * String(String original) : String���� original�� ���ڿ��� ���Ӱ� ������ ���ڿ���ü �ʱ�ȭ��.
 * 
 * ��ü ������
 * �ڵ�(�Ͻ��� ��ü����)
 * String s1 = "Test";
 * 
 * ����(����� ��ü����)
 * String s2 = new String("Test");
 * 
 */

public class StringEx01 {

	public static void main(String[] args) {

		String s1 = "TEST";
		String s2 = "TEST";

		if (s1 == s2) // �ּҰ��� ����.
			System.out.println("s1 �� s2�� ����.");
		else
			System.out.println("s1 �� s2�� ���� �ʴ�.");

		System.out.println();

		String s3 = new String("Test");
		String s4 = new String("Test");

		if (s3 == s4)
			System.out.println("s3 �� s4�� ����.");
		else
			System.out.println("s3 �� s4�� ���� �ʴ�.");

		
		if (s1.equals(s2))
			System.out.println("s1�� s2�� ����");
		else
			System.out.println("s1 �� s2�� ���� �ʴ�.");

		if (s3.equals(s4))
			System.out.println("s3�� s4�� ����.");
		else
			System.out.println("s3�� s4�� ���� �ʴ�.");
		// �Ͻ��� ��ü ������ ����� ��ü������ ������
		// 1.(==)�����ڴ� ��ü�� �ּҰ��� ���Ѵ�.
		// 2.��ü�� ���� �񱳴� equals()�޼ҵ带 Ȱ����.
		
		//StringBuffer(str)//hello String Str = "hello"16 21

	}

}
