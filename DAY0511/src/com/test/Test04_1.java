package com.test;

import java.util.Random; 
import java.util.Scanner;

public class Test04_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] str = {"����","����", "��"};
		
		Random rd = new Random();
		
		
		//�����߻�
		int com = rd.nextInt(3)+1;
		
		int user ;
		
		do {
			System.out.println("1:���� 2:���� 3:�� �� �Է�");
			user = sc.nextInt();
		}while(user <1 || user > 3);
		
		//System.out.println("����� : " +str[user-1]);
		//System.out.println("��ǻ�� : " +str[com-1]);
		//ó�� ��� ���
			String result ; 
			result = "���º�~~~!!! ";
			//����ڰ� �¸��� ���
			if((user==1 && com ==3)||(user==2 && com ==1)||(user==3 && com ==2))
			result = "����ڰ� �¸��Ͽ����ϴ�" ;		
			//��ǻ�Ͱ� �¸��� ���
			if((user==1 && com ==2)||(user==2 && com ==3)||(user==3 && com ==1))
				result = "��ǻ�Ͱ� �¸��Ͽ����ϴ�" ;
			
			System.out.println("���� �º� ���:"+result);
			
		
		
		
		
		
		
		
		
		
	}

}
