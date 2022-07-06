//�޼ҵ� => �θ�   / ���� => �ڳ�

package com.inher;

class SuperExam{

	private int a = 5 ;
	protected int b = 10 ;
	public int c = 20 ;
	
	public void write() {
		System.out.println("super write �޼ҵ� : "+a+":"+b+":"+c);
	}

}
class SubExam extends SuperExam{

	protected int b = 100 ;
	
	public void print() {
		System.out.println("sub print �޼ҵ� : "+super.b+" : "+c); //b�� �θ�
	}
	
@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("sub write �޼ҵ� : "+b+" : "+c); // b�� �ڽ�
	}	
}


public class InherExam {

	public static void main(String[] args) {
		SubExam se = new SubExam();
		se.write();
		se.print();
		
		((SuperExam)se).write(); // �޼ҵ�� �׻� �ڽİ��� ȣ���ϱ� ������ ���°� �θ��� ���� ȣ���ϴ� �� ó�� ������ �ڽ��� ���� ȣ�����.
		System.out.println("se.b : "+se.b);
		System.out.println("se.b : "+((SuperExam)se).b);

	}

}
