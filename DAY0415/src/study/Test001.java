package study;
//������ (����,����,����)
//�� ) ���� �� ������ ������ �Է¹޾�, ������ ����� ���. ���α׷��� ����.
//��, ����� �Ҽ� 2�ڸ����� ��� !

import java.util.Scanner;
class Test001 {

	public static void main(String[] args) {
		
		int a, b, c ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ? ") ;
		a = Integer.parseInt(sc.next());
		
		System.out.println("�����?") ;
		b = Integer.parseInt(sc.next());
	
		System.out.println("���а���") ;
		c = Integer.parseInt(sc.next());
	
		
		int total = a+b+c ;
		System.out.println(total);
		
		double aver = (a+b+c)/3 ;
		System.out.printf("%.2f",aver);
	
		sc.close();
		//��ĳ�� �ݴ� �ڵ�
	}

}
