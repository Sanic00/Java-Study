package study;

/*
 *  ����ڷκ��� �ϳ��� ���ڸ� �Է¹��� ����, �� ����ŭ 3�� ����� ����ϴ� ���α׷� �ۼ�
 *  ���࿡ ����ڷκ��� 5�� �Է¹޾Ҵٸ� 3 6 9 12 15�� ����Ͻÿ�
 */

import java.util.*;
public class WhileExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n, i = 1;
		System.out.print("�ϳ��� ���ڸ� �Է��Ͻÿ� : ");
		n = sc.nextInt();
		while (i<=n) {
			i++;
		System.out.printf(i*3+" ");
		}
		System.out.println();
	}

}
