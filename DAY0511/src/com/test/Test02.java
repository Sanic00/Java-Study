package com.test;
/*��]
 * 	���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� �����߿���
 * 3�� ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 */
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yang [] = new int[10];
		
		//System.out.println("���� ���� 10���� �Է��ض�");
		for(int i = 0 ; i<yang.length; i++) {
			System.out.print((i+1)+"��° ����:");
			yang[i]= sc.nextInt();
			
			//if(yang[i]>0 && yang[i]%3==0)		
			//System.out.print(yang[i]+" ");
			}
			System.out.println();
		System.out.println("3�� ��� : ");
		for(int i = 0 ; i<yang.length; i++) {
			if(yang[i]>0 && yang[i]%3==0)		
				System.out.print(yang[i]+" ");
				}
	
	}
	}


