package com.test;

import java.util.*;

public class Test04_ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] com = { "����", "����", "��" };
		// ����, ����, �� ���ڿ��� ������ �迭

		System.out.println("���Ϳ� ���� ���� �� ������ �����մϴ�");
		while (true) {
			System.out.print("���� ���� �� : ");
			String a = sc.next();
			if (a.equals("�׸�")) {
				System.out.println("������ �����մϴ�.");
				break;// �ݺ����� Ż��
			}

			// ��ǻ�Ͱ� ���� ���� �� ���� �������� �����Ѵ�.
			int n = (int) (Math.random() * 3);
			// 0 1 2 �߿��� ������ ������ ����
			String b = com[n];

			System.out.print("����� :" + a + ",���� : " + b + ",");

			// ����ڰ� ������ ���
			if (a.equals("����")) {
				if (b.equals("����")) {
					System.out.println("�����ϴ�.");
				} else if (b.equals("����")) {
					System.out.println("���Ͱ� �¸��Ͽ����ϴ�.");
				} else {
					System.out.println("����ڰ� �¸��Ͽ����ϴ�.");
				}
			}

			// ����ڰ� ������ ���
			else if (a.equals("����")) {
				if (b.equals("����")) {
					System.out.println("����ڰ� �¸��Ͽ����ϴ�");
				} else if (b.equals("����")) {
					System.out.println("�����ϴ�.");
				} else {
					System.out.println("���Ͱ� �¸��Ͽ����ϴ�.");
				}
			}
			// ����ڰ� ���� ���
			else if (a.equals("��")) {
				if (b.equals("����")) {
					System.out.println("���Ͱ� �¸��Ͽ����ϴ�");
				} else if (b.equals("����")) {
					System.out.println("����ڰ� �¸��Ͽ����ϴ�.");
				} else {
					System.out.println("�����ϴ�.");
				}
			}

			// ������ ������ ���� �ƴѰ��
			else {
				System.out.println("�ٽ� �Է��ϼ���.");

			}
		}

	}

}
