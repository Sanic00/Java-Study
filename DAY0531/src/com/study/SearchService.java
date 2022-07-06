package com.study;

// ���� ȸ���� �˻��ϴ� ����� ���� 
public class SearchService {

	Member[] members = new Member[5];// ��ü�迭�� 5���� �����͸� ������ �� �ְ� �Ѵ�
	
	
	public SearchService() {
		// TODO Auto-generated constructor stub
		// �����ڸ� ȣ���ؼ� ��ü�� �����ɶ� 5���� �迭�� �����ϴ� �κ�
		// members ��ü �迭�� ȸ������ ������ ����
		members[0]=new Member("ȫ�浿", 195, 120, "������");
		members[1]=new Member("����", 187, 97, "�ѳ���");
		members[2]=new Member("��������", 167, 73, "������");
		members[3]=new Member("������", 152, 58, "���");
		members[4]=new Member("�̼���", 182, 95, "���");
	}
	// ȸ���� �̸��� ������ �Ķ���� = �Ű������� ���� �ִ´�. �װ��� ã�Ƽ� �ش� ȸ���� �ִ��� ������ 
	// ȸ���� �̸��� �Ű������� �޾Ƽ� �ش� �̸��� ������ �ִ� ȸ�� ��ü �迭���� ã�� 
	// �ش� ȸ���� ������ ����ϴ� ��� ���� 
	boolean searchMember(String name) {
		boolean searchResult = false;
		
		for(int i =0;i<members.length;i++) {
			if(members[i].getName().equals(name)) {
				// �ش� �̸��� ȸ���� ã�� ������ ������ ��� 
				prtInfo(members[i]);
				searchResult = true;
			}
		}
		return searchResult;
	}
	
	// �Ķ���� ������ ȸ����ü�� ������ �޾Ƽ� ����ϴ� �޼ҵ� 
	private void prtInfo(Member member){
		System.out.println(member.getName()+"���� ã�� ��� ��");
		System.out.println("�̸� :"+member.getName());
		System.out.println("���� :"+member.getHeight());
		System.out.println("������:"+member.getWeight());
		System.out.println("���� :"+member.getNation());
	}
	
}
