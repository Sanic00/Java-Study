package com.study;

import java.util.*;

public class ArrayListEx {
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("�����⵿��");
		list1.add("���ɰ���");
		
		
		List<String> list2 = new ArrayList<String>(list1);
		list2.add("��ǻŸ");
		
		List<String> list3 = new ArrayList<String>();
		list3.addAll(list2);
		int n = list3.indexOf("���ɰ���"); //index ��ġ�� 1
		System.out.println(n);
		
		list3.add(n+1,"�ڳ�");
		System.out.println(list3);
		
		ListIterator<String> it = list3.listIterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
	}

}

//
//int[]deck =new int[52];
//string [ ] suit ;
//string [ ] rank ;
//PUBLIC CARD(String Shape, String )
//ArrayList<Card>list = new ArrayList<Card>();