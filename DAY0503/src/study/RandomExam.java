package study;
/*
������ ī�� ���� ���ߴ� ����

0���� ���� 99���� ������ ���� ���� ī�带 ���� �����
�� ī�� ���� ���ߴ� ������.
ī����Ǽ��� 77�̶�� ���� ���ߴ� ����� 55�� �Է��ϸ�
�� ���� �ٽ� 70�� �Է��ϸ� �� ���� ��� ������ ������ �������鼭
������ ���ߴ� ����.
������ �ݺ��ϱ� ���� y/n�� ���� , n�� ���� ������.

��ǻ�Ͱ� ���� ���� ���Ƿ� �����ϱ� ���� Random Ŭ������ �����.
Random Ŭ���� ������ 
1.import java.util.*;
2. Random r =new Random();(main()�޼ҵ� �ȿ� �ۼ�)
int i = r.nextInt(100): �� �ǹ̴� 0~99������ ������ ������ ����
 */

import java.util.*;

public class RandomExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int j = 0;
		// i : ��¥ ��(������) /j �� ��� �Է��ϴ� ��(���ϴ°�)
		int i = r.nextInt(100);

		String str;
		// while (true) {
		// System.out.println("������ �Է��ϼ��� : ");
		// i = sc.nextInt();
		System.out.println("���纸���� : ");
		// int j = 0;
		while (j < 100) {
			j = sc.nextInt();
			if (i > j) {
				System.out.println("�� ū ���� �Է��ϼ���");
			}
			continue;
			if (i < j) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			}
			continue;
			if (i == j) {
				System.out.println("�����Դϴ�. ������ �����Ͻðڽ��ϱ�?");
				str = sc.next();
				if (str.equals("yes")) {
					i = r.nextInt(100);
					continue;
				} else {

				}
			}
			break;
		}
		// {System.exit(0);break;
	}
}