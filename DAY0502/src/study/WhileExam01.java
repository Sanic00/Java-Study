package study;

/*
 * ��]
 * ����ڰ� �Է��ϴ� ������ ����ؼ� ���� ������.
 * ���࿡ 0�� �ԷµǸ� ���ݱ��� �Էµ� ������ �հ踦 ����ϰ� �����ϴ� ���α׷��� �����Ͻÿ�.
 * ��, while�� �̿�
 * 
 */

import java.util.Scanner;
public class WhileExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i, sum ;
		i = sum = 0 ;
		System.out.println("������ �Է��Ͽ���");
		
		while(i>=0) {
		if(i>0)
		sum += i ;
		i ++ ;
		i = sc.nextInt();
		if (i==0) 
			break ;}
			System.out.println("������ �հ��"+sum);
	}


	
}
