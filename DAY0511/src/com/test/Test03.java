package com.test;
/*
 * ��]
 * 
 * Ű����� ���� �׼��� �Է¹޾� ������,������, ��õ����, õ����, 500��¥��, 100��¥������,
 * 50��¥�� ����, 10��¥�� ����, 1����¥�� �������� ��ȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ��, �迭�� �ݺ����� Ȱ��
 * �迭�� : unit
 * 
 *
 * 
 */
import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		int unit[] = {50000,10000,5000,1000,500,100,50,10,1} ;
		int n ;
		System.out.println("�ݾ��� �Է��ϼ���");
		n = sc.nextInt();
		
		for (int i = 0 ; i<unit.length;i++) {
			//���� ���� ���
			int res = n/unit[i];
	
			// res ���� �ִ� ��� 
			if (res > 0) {
				System.out.println(unit[i]+"��¥��:"+res+"��");
				n = n%unit[i]; // money ����
				
				
			}
			
			
			/*	n-unit[i]/unit[i+1]
			unit[i] =(n%unit[i])/unit[i] ;
				System.out.print("unit["+i+"]:"+unit[i]);}
		65000 = n 				n/a[1]
(n%a[1])/a[2]		n
						*/
	}
	}
	
}
