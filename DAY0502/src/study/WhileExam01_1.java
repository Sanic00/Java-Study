package study;

/*
 * ��]
 * ����ڰ� �Է��ϴ� ������ ����ؼ� ���� ������.
 * ���࿡ 0�� �ԷµǸ� ���ݱ��� �Էµ� ������ �հ踦 ����ϰ� �����ϴ� ���α׷��� �����Ͻÿ�.
 * ��, while�� �̿�
 * 
 */

import java.util.Scanner;
public class WhileExam01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = 1 , sum =0 ;
		
		while(true) { // while (n ! =0 ) ���� ��Ƶ� ��.
		
			System.out.print("���� �Է�(0:����):");
			n = sc.nextInt();
			if(n==0)
				break;
			sum+=n;
					
		}
		System.out.println("���ݱ����� �հ�:"+sum);
		}
	
}
