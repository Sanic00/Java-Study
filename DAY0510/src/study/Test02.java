package study;
import java.util.*;


/*
 * ����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾�
 * �Է¹��� ���߿��� ���� ū ���� ����ϴ� ���α׷� �ۼ�
 * 
 * ��, �迭�� �̿��Ͽ� �����Ͻÿ�.

 *�Է��� ������ ���� : 9
 *������ �Է� : 4, 7 , 9, 1, 3, 2, 5, 6, 8
 *���� ū �� : 9
 *
 *
 */


public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n ; // �Է¹��� �� ����
		System.out.print("�Է��� ������ ���� : ");
		n = sc.nextInt();
		
		//�Է¹��� ������ ũ�⸦ ������
		int arr [] = new int [n];
		
		System.out.print("������ �Է�[���� ����]");
		for(int i =0 ; i<arr.length ; i++) {
			// �迭�� �Է¹��� ������ ����.
			arr[i] = sc.nextInt();
		}
		
		int max = 0 ; // ���� ū ���� ������ ����
		for(int i =0 ; i<arr.length ; i++) {
			
			//max���� ū �� ��󳻱�.
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("���� ū �� : "+max);
		
		
	}
				
	}
