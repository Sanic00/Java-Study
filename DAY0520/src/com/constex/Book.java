package com.constex;

public class Book {

	String title ; 
	String author ;
	
	//�����ڰ� ���� Ŭ������ ���� ���� �ʴ´� ! 1���� ���ٸ� �����Ϸ��� �����  
	
	//�⺻������(�Ű������� ���� ������) 
	public Book() {
	}
	
	//�����ڸ� ���� �ʵ� �ʱ�ȭ
	public Book(String t) {
		
		title = t; //�Ű������θ� ��ü ����
		author = "���ڹ̻�";
	}

	public Book(String t, String a ) {
		
		title = t; //�Ű������θ� ��ü ����
		author = a;		
	}

	
}
