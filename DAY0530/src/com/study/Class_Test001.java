package com.study;
/* ���� ������ �ʱ�ȭ ������ ��ġ�� ������ ��� �� �� ����. 
 * (�ڵ� �ʱ�ȭ ����� �������� �ʴ´�. )
 * 
 * 
 */
public class Class_Test001 {
	
	  int b; // �������� (�ν��Ͻ� ��� ����)
	  // ����ϴ� �������� �ʱ�ȭ���� ���� ��� int�� ���� �ڵ����� 0���� �ʱ�ȭ ��
	  
	public static void main(String[] args) {
		
		int a =10; // ��������  = �ʱ�ȭ ������ ������ error!
		System.out.println("a :"+a);
		Class_Test001 ct = new Class_Test001();
		System.out.println(ct.b);
	}

}
