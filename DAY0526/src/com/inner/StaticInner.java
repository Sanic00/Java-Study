package com.inner;

import com.inner.StaticInner.Inner;

/*
 * static �̳� Ŭ���� 
 * 
 * -static �̳� Ŭ������ ��¿ �� ���� �����ϴ� ��찡 �ִµ�
 *  ��¿ �� ���� �����ϴ� ���� �̳�Ŭ���� ���� static ������ ������ ���� ���
 *  ��¿ �� ���� �ش� �̳�Ŭ������ static���� �����ؾ���.
 *  
 *  
 *  �̳� Ŭ������ ������� static�� �����ؾ� ��.
 *  	
 *  	����
 *  
 *  	class Outer{
 *  
 *  	int aa ;
 *  	
 *  	static class Inner { // static �̳� Ŭ������ �����ؾ߸�,
 *  	static int bb ;	 // �̳� Ŭ���� ���� static ������ ���� �� ����
 *  	
 *  	 }
 *  	}
 *  
 * 		Outer.Inner in = new Outer.Inner(); 
 * 		Outer.Inner in = new Outer().new Inner();
 * 
 */

public class StaticInner {

	int a = 10;
	private int b = 100 ;
	static int c = 200 ;
	
	static class Inner {
		static int d = 1000 ;
	
	public void printData() {
		//System.out.println("int a :"+a);
		//System.out.println("int b :"+b);
		System.out.println("int c :"+c);
		System.out.println("int d :"+d);
	
	}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInner.Inner in = new StaticInner.Inner();
		in.printData();
	}

}
