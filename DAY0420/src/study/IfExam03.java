package study;

import java.io.*;
public class IfExam03 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
/* ���� 1) ����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ �������, ��������, 0������ �����ϴ� ���α׷� ����.
 * ���� 2) ������ �⵵�� �Է¹޾� �Է¹��� �⵵�� �������� ��������� �����ϴ� ���α׷� ���� 
 * �Է��� BufferedReader 
 * if or ���׿����� Ȱ��
 * 
 * �������� ����
 * -�⵵�� 4�� ����̸鼭 100�� ����� �ƴϰų�
 * 400�� ����̸� ���� �׷�ġ ������ ���
 * 
 * 1)��øif
 *
 *  */
	
		BufferedReader br = new BufferedReader(
				new InputStreamReader (System.in));
	
		
		  int a ;
		  System.out.println("������ ���� �Է� : "); a = Integer.parseInt(br.readLine());
		  
		  if (a>0) System.out.println("�� ������ ����Դϴ�"); else if (a == 0)
		  System.out.println("�� ������ 0�Դϴ�"); else System.out.println("�� ������ �����Դϴ�");
		 
;

  System.out.println();
  
  int b ;
  
  System.out.println("���ش� �������ΰ��� ?"); b = Integer.parseInt(br.readLine());
  
  if (b%4==0 && b%100!= 0) System.out.println("�����Դϴ�"); else if (b%400==0)
  System.out.println("�����Դϴ�"); else System.out.println("����Դϴ�");
  
  //System.out.println("�Է��� ����");
 	
	System.out.println();
	
	
	int c ;
	String d ;
	
	System.out.println("���ش� �������ΰ���?");
	c = Integer.parseInt(br.readLine());	
	
	
	d = (c%4==0 && c%100!= 0)||(c%400==0) ? "����" : "���" ;
	System.out.println(c+"��"+d+"�Դϴ�");
	
	
	}

}
