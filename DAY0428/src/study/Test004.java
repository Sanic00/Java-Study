package study;
/*
 * �Էµ� ������ ����� ���ϴ� ���α׷��� �����Ͻÿ�.
 *1. ���� ���� �Է��� ������ ������ ����ڷ� ���� �Է� �޴´�.
 *2.�Է¹��� ����ŭ ��հ��� ���Ͽ� ����Ѵ�.
 *��,��հ��� �Ǽ��� ó���Ѵ�. 
 */

import java.util.*;
public class Test004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n, count, sum =0;
		double avg = 0 ;
		
		System.out.print("�Է��� ������ ����:");
		count = sc.nextInt();
		
		for (int i=0;i<count;i++) {
		System.out.print("���� �Է�:");
		n=sc.nextInt();
		sum = sum+n;}
		
		avg = (double)sum /count ; 
		
		System.out.printf("�Է��� ������ ��� : %.2f\n", avg);
		
	}

}
