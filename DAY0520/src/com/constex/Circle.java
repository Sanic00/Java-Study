package com.constex;

public class Circle { //Ŭ����
	
	int radius ; //�Ӽ�, �������, �ʵ�
	String name ; //

	//�������� ������ ��ü�� ������ ��, �ʵ带 �ʱ�ȭ�ϱ� �����̴�.
	
	public Circle() { //������ �޼ҵ� : �������� �̸��� Ŭ������ �̸��� ����.
		//�ʵ� �ʱ�ȭ
		radius = 1;
		name = "";//null�� �� => null : ������ ������ ����ִ� ��
			
}

	public Circle(int r, String n) { //�Ű������� Ȱ���Ͽ� �ʵ带 �ʱ�ȭ
		//�Ű������� ���� ������ (��ü�� ���鶧,�ϴܰ� ���� �ʱ�ȭ�ص� ��)
		//������ ����Ÿ���� ����.(void, return ������ �����ڰ� �ƴ� �Ϲ� instance�� �޼ҵ尡 �Ǵ°���)
		//�����ڴ� new��� �����ڸ� ���� ��ü ������ �� , �� 1���� ȣ���.
		
		radius = r;
		name = n ;
	}
		
		public double getArea() {
		return 3.14 * radius * radius ;
		}
		
		
		
		//return ; �־ ������ ���� ���� 	
		//�ڷ����� �ִ� ���� ��ȯ�� �� return  �� �־�� �մϴ�. 
		//Ư���� ���� ���� ��쿡�� return 0;�̳�  return ��  �ۼ��ص� �˴ϴ�



}


