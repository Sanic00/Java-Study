package com.study;
import java.util.*;
public class SearchMain {

	// �̸��� �Ķ���ͷ� �Ͽ� �˻��ϴ� ���α׷� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//searchMember ȣ���ϱ� ���� ��ü �������!
		SearchService ssv = new SearchService();
		
		do {
			System.out.print("�˻� ȸ�� �̸� �Է� :");
			String name = sc.next();
			
			boolean searchResult = ssv.searchMember(name);
			if(searchResult) break; // ã���� �����Ŵϱ� 
			System.out.println("�ش� ȸ���� ���� �����ʽ��ϴ�.");
		} while (true);
	}

}
