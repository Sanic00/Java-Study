package study;

import java.io.*;

/*
 * ����ڰ� �Է��ϴ� ������ ����ؼ� ���� ���ư�
 * ���� 0�� �ԷµǸ� ���ݱ��� �Էµ� ������ ���� ����� ����ϰ� ������.
 */
public class WhileExam02 {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n ,sum  ;
		n = 1 ;
		sum = 0; 
		
		while (n!=0) {
		System.out.println("������ �Է��Ͻÿ�, 0 ���� :");
		n=Integer.parseInt(br.readLine());
		 /*
		if (n==0)
			break ; 
		*/
		sum+=n ;
		}
		System.out.println("���ݱ��� �Է��� ���� �հ�"+sum);
	}
}
