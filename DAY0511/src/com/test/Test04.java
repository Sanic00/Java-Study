package com.test;

import java.util.*;

public class Test04 {
	/*
	 * ��] ��ǻ�Ϳ� ����� ������ ���� ���� �� ������ ����. ����ڰ� ���� 3���� �� �ϳ��� �Է��ϰ� ������ ��ǻ�ʹ� �������� �ϳ��� �����Ͽ�
	 * ����ڿ� ���� ���� �̰������ �Ǵ��ϰ� ����ڰ� �׸��� �Է��ϸ� ������ ������.
	 * 
	 * ���ڿ� �迭 ���� String [] str = {"����","����","��"};
	 * 
	 * ��ǻ�Ͱ� ���� ���� �����ϰ� �����ϱ� ���ؼ��� int n = (int)(Math.random()*3);
	 * 
	 * ��ǻ�Ͱ� �� ���� ���� ���� �� if(str[n].equals("��
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = (int) (Math.random() * 3);
		String[] str = { "����", "����", "��" };
		String com = " ";
		String user = " ";
		// ��ǻ�Ͱ� ���� ���� �����ϰ� �����ϱ� ���ؼ���

		// String[i]str =

//		int i = 0 ;
		while (true) {
			System.out.println("����,����,�� �� �ϳ��� �Է��ϼ���");
			user = sc.next();
			// i++;
			if (str.equals("����")) {
				com = "����";
				//user = "����";
				System.out.println("com:" + com + " ,user:" + user + " com: " + com + " �̰���ϴ�");
			}

			else if (str.equals("����")) {
				//user = "����";
				com = "���� ";
				System.out.println("com:" + com + " ,user:" + user + "   �����ϴ�.");
				;
			}

			else if (str.equals("����")) {
				com = "����";
				//user = "����";
				System.out.println("com:" + com + " ,user:" + user + "user : " + user + "�� �̰���ϴ�.");
			}

			 if (str.equals("����")) {
				com = "����";
				//user = "��";
				System.out.println("com:" + com + " ,user:" + user + "com: " + com + "�� �̰���ϴ�");
			}

			else if (str.equals("����")) {
				user = com;
				System.out.println("com:" + com + " ,user:" + user + "   �����ϴ�.");
			}

			else if (str.equals("����")) {
				com = "��";
			//	user = "����";
				System.out.println("com:" + com + " ,user:" + user + " user: " + user + "�� �̰���ϴ�.");
			}

			 if (str.equals("��")) {
				com = "��";
			//	user = "����";
				System.out.println("com:" + com + " ,user:" + user + "com : " + com + "�� �̰���ϴ�");
			}

			else if (str.equals("��")) {
				user = com;
				System.out.println("com:" + com + " ,user:" + user + "   �����ϴ�.");
			}

			else if (str.equals("��")) {
				com = "����";
				//user = "��";
				System.out.println("com:" + com + " ,user:" + user + " user: " + user + "�� �̰���ϴ�.");
			}

			System.out.println("��� ������ ���� �Ͻðڽ��ϱ�(y/n)");
			if (sc.next().equals("n"))
				break;
		}

	}

}
