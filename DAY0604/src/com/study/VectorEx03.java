package com.study;

import java.util.*;
public class VectorEx03 {

	private static final String colors[] = {
			"����","���","���","�Ķ�","��Ȳ��","���λ�","�����"
	};
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		for(String str : colors)
			v.add(str);
			
		System.out.println("(������)ù��° ��� :"+v.firstElement());
		System.out.println("����° ��� :"+v.get(2));
		System.out.println("������ ��� :"+v.lastElement());
		System.out.println("��� ���� :"+v.size());
		System.out.println("������ ũ�� :"+v.capacity());
		
		//ù��° ��Ұ��� ������� ����
		v.set(0, "���");
		System.out.println("(������1)ù��° ��� :"+v.firstElement());
		System.out.println("��� ���� :"+v.size());
		
		//���Ϳ� ������(���) �߰�
		//ù��° ��ҿ� ���� �߰�
		v.insertElementAt("����", 0);
		System.out.println("(������2)ù��° ��� :"+v.firstElement());
		System.out.println("��� ���� :"+v.size());
		
		//��ü ���
		for(String str : v)
			System.out.print(str+" ");
		System.out.println();
		
		//�˻�
		String s = "�뷮";
		if(v.contains(s)) {
			int i = v.indexOf(s)+1;
			System.out.println(s+"-->��ġ :"+i);
		}
		
		//����
		v.remove(6);
		System.out.println("\n�ڷ� ���� ��");
		for(String str : v)
			System.out.print(str+" ");
		System.out.println();
		
		//�������� ����
		Collections.sort(v);
		//�������� ���� �� 
		System.out.println("\n�������� ���� �� :");
		for(String str : v) 
			System.out.print(str+" ");
			System.out.println();
			
			//�˻��� �������� ���ĵ� �ڷῡ���� ������.
			int idx =	Collections.binarySearch(v, "�Ķ�");
			System.out.println("�Ķ�:"+idx+" index�� ����"); //������ �ε��� ���, ������ ���� ���
		
			//�������� ����
			Collections.sort(v,Collections.reverseOrder());
			//�������� ���� ��
			System.out.println("\n�������� ���� �� :");
			for(String str : v) 
				System.out.print(str+" ");
				System.out.println();
				
			//�������� �˻�
				idx = Collections.binarySearch(v, "���λ�");
				System.out.println("���λ� : "+idx+" index�� ����");//������ �ε��� ���, ������ ���� ���
			
		}
		
	}

