package com.methodex;

public class ReferenceParameter {

	public void increase(int[]n) {
		for(int i =0  ; i<n.length;i++) 
			n[i]++;		
	}

	public static void main(String[] args) {
		
		int[] ref = {100,600,1000}; //����
		//��ü ����
		ReferenceParameter rp = new ReferenceParameter();
		
		//�޼ҵ� ȣ�� �����Ϸ��� ���ڸ� ����(��ü)�ڷ����� ����� ��츦 �ǹ���.
		//������ ��ü�� �ƴ� �迭�� �̿��Ͽ� ȣ���ߴ�.
		
		//call by reference
		
		rp.increase(ref);
		for (int i =0 ; i<ref.length;i++) {
			System.out.println("ref["+i+"]:"+ref[i]);
		}
	}

}