package com.study;
 import java.util.*;
public class ArrayTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �̸��� �˻��ϴ� ���α۷�
		String names[] = {"ȫ�浿","����ġ","�̵�","�������","�̼���","������","�縸��","���ο�"};
		Scanner sc = new Scanner(System.in);
		int index =-1; // �ε����� �ƹ��͵� ����
		do {
			System.out.println("�˻��� �̸� �Է� :");
			String name = sc.next();
			for(int i = 0;i<names.length;i++) {
				// �Է¹��� �̸��� �迭�� ���� �Ǿ��ִ� �̸��� �������� ��
				if(name.equals(names[i])) {
					index = i;
				}	
			}
			if(index !=-1) { // ã�Ҵ� 
				System.out.println(name+"�� �迭�� "+index+"�ε��� ��ġ���� ã�ҽ��ϴ�.");
				break;
			}
			System.out.println("�Է��Ͻ� �̸��� names�迭�� �������� �ʽ��ϴ�. ");
		} while (true);// ��� �ݺ��ϱ� ���� 
		for (String s : names) {
			System.out.print(s+"\t");
		}
	}

}
