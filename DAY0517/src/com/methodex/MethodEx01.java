package com.methodex;

/*�޼ҵ�
 * 
 * 1. �޼ҵ�(��� �Լ�) : ��ü�� �� �� �ִ� ���۵��� ������ ����
 * 					�޼ҵ��� ������ �ΰ����� ���� ���´�.
 * 					1. �ν��Ͻ� �޼ҵ� 2. static �޼ҵ�
 *					(��ü�� �����ؿ� ���� ����)
 */
//�ϴ��� ����� ���� �޼ҵ�

public class MethodEx01 {

	public int add(int i,int j){
		return i + j;	
	}
	
	public int sub(int i,int j){
		return i - j;	
	}
	
	public int multi(int i,int j){
		return i * j;	
	}
	
	public int div(int i,int j){
		return i / j;	
	}
	//return ����� ���� �ٽ� ����������(ȣ��� ����)
	public static void main(String[] args) {

		MethodEx01 me = new MethodEx01();

		int i = 10 ;
		int j = 10 ;
	
		int a,b,c,d ;
		a = me.add(i, j);  // �����ϴ� ����� ���� �޼ҵ� ȣ��		
		b = me.sub(i, j) ; // �����ϴ� ����� ���� �޼ҵ� ȣ��
		c= me.multi(i, j) ; // �����ϴ� ����� ���� �޼ҵ� ȣ��
		d = me.div(i, j) ; // ������ ����� ���� �޼ҵ� ȣ��
		
		System.out.println("���ϱ� �� ��� :"+a);
		System.out.println("���� �� ��� :"+b);
		System.out.println("���� �� ��� :"+c);
		System.out.println("������ �� ��� :"+d);
	
	
	}
	
}

