package study;

import java.util.Scanner;

/* 
 * ��) 5���� ������ ������ �Է¹޾� ������ ����� ���ϰ� ����� �̿��Ͽ� ������ �����ϴ� ���α׷��� �����Ͻÿ�.
 * ����A�� ������ 90�� �̻�
 *		B			80�� �̻�
		C			70�� �̻�
		D			60�� �̻�
		F			60�� �̸�
 * 
 */
//java.util.scanner ;
public class IfExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in) ;
				
		int a, b, c, d, e ;
		char hak ;
		
		System.out.println("�������� : ");
		a = sc.nextInt() ;
		
		System.out.println("�������� : ");
		b = sc.nextInt() ;
		
		System.out.println("�������� : ");
		c = sc.nextInt() ;
		
		System.out.println("��ȸ���� : ");
		d = sc.nextInt() ;
		
		System.out.println("�������� : ");
		e = sc.nextInt() ;
		
		int sum = a+b+c+d+e ;
		int avg = (a+b+c+d+e)/5 ;
		
		System.out.println("������"+sum+"�Դϴ�");
		System.out.println("�����"+avg+"�Դϴ�");
		
		if(avg >=90) {
			hak = 'A' ;
		}else if (avg >=80) {
			hak = 'B' ;
			//System.out.println("B");
		}else if (avg >=70) {
			hak = 'C' ;
			//System.out.println("C");
		}else if (avg >=60) {
			hak = 'D' ;
			//System.out.println("D");
		}else hak = 'F' ;		
	}
		//System.out.println("����� ������"+hak+"�Դϴ�.") ;
}
