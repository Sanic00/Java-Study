package ch03;

public class EX_18 {

	public static void main(String[] args) {
		double pi = 3.141592;
		
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000);		//3.142�� �������� int ���̶� ���� 3 �ڿ� �Ҽ����� ������
		System.out.println((double)Math.round(pi*1000)/1000.0); 
		System.out.println((int)(pi*1000));	// 3141�� ����� ������ �Ϻη� ���ս��� ���� int������ ��ȯ ��Ų��.
//		double shortPi = Math.round(pi * 1000) / 1000.0;
//		System.out.println(shortPi);

	}

}
