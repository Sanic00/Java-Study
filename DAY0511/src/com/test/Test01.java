package com.test;
/*
 *��]
 * 
 * �л� ���� �Է¹޾� �Է¹��� �ο��� ��ŭ �л��� �̸��� ��ȭ��ȣ�� �Է¹ް�
 * �Է� ���� ���� ��ü�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ��, �迭�� �̿��Ͽ� �ۼ��Ͻÿ� 
 * 
 */

import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
				
		int n ;
		System.out.println("�л���: ");
		n = sc.nextInt();


		String[] name = new String[n] ;
		String[] phone = new String[n];

				
		for(int i =0 ; i < name.length ; i++) {
			System.out.println("�̸�     ��ȭ��ȣ �Է� ("+(i+1)+"  :   [���鱸��]:");
			name[i] = sc.next();
			phone[i] = sc.next();
			}
				
			System.out.println();
			System.out.println("----------------------------");
			System.out.println(" �Է¹��� �л��� : "+n+"��");
			System.out.println("----------------------------");
			System.out.println(" �� ��             ��ȭ��ȣ ");
			for(int i =0 ; i < name.length ; i++) {
			System.out.println(name[i] +"          "+phone[i]);
			}
			System.out.println("----------------------------");
		
	}

}
