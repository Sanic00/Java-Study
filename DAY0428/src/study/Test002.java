package study;
//���Ѵ�� �ΰ��� ������ �Է¹޾� �հ踦 ���ϴ� ���α׷��� �ۼ��Ͻÿ�
//���� : n1,n2

import java.util.*;
public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1,n2 ;
		
		
		//for(;;) {//�������� ���ư��� for��
		while(true) {//�������� ���ư��� while��
		System.out.print("�����Է�:");
		n1 =sc.nextInt();
		if(n1==0)
			break;
		System.out.print("�����Է�:");
		n2 =sc.nextInt();
		System.out.println("�ΰ��� �հ�� : "+(n1+n2));	}


	}
	
}
