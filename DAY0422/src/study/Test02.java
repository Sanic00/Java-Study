package study;

/*
 * ������ ���ĺ��� �Է¹޾� ������ ������ �����ϴ� ���α׷� ����
 * �����̸� �����̶�� ���, �����̸� �����̶�� ���
 * ��, ��ҹ��� ��� �����ϰ�, ���ĺ��̿��� ���ڰ� �ԷµǸ� �Է� ���� ó���Ͻÿ�.
 * 
 */

import java.io.*;
public class Test02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		char ch ; //���ڸ� ������ ����
		String s ; //����� ������ ����(�����̳�~�����̳�~)

		System.out.println("���ĺ� ���� �Է�:");
		ch = (char)System.in.read(); }
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {// ���ĺ����� �ƴ��� ����
			if(ch == 'a' || ch == 'e' ||ch == 'o' ||ch == 'i' ||ch == 'u')
			System.out.println("����");
			else if(ch == 'A' || ch == 'E' ||ch == 'O' ||ch == 'I' ||ch == 'U')
				System.out.println("����");
			else 				
				System.out.println("����");
		}else {
			System.out.println("���� �Է� ���� !!!!");					
		}			
	}
}
		/*
		 * s = ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))? (s = ((ch == 'a' || ch ==
		 * 'e' ||ch == 'o' ||ch == 'i' ||ch == 'u') || (ch == 'A' || ch == 'E' ||ch ==
		 * 'O' ||ch == 'I' ||ch == 'U')) ? "����" : "����") : "���� �Է� ���� !!!!" ;
		 * 
		 * System.out.println("�Է��� ���ĺ��� "+s+"�Դϴ�");
		 * 
		 * 
		 */