package com.inner;

public class OuterEx01 { //�ܺ�

	
	public static class InnerEx01{ //���� ( static class)
	
		static int x =  10;
		//main method�� ���� class�ȿ� ��ġ
		public static void main(String[] args) { // static method)
			OuterEx01.InnerEx01 oi = new OuterEx01.InnerEx01();
			
			//3�� �� ������ �� ����� ����.
			System.out.println("oi : "+oi.x);
			System.out.println("ot : "+x);
			System.out.println("ot : "+OuterEx01.InnerEx01.x);
		}
	
	}
	
}
