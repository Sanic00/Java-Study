package com.inner;

/*Anonymous(�͸�) �̳� Ŭ���� 
 * 
 * 
 * -�͸��̶� ???
 * 		�̸��� ���� ���� �ǹ���.
 * 		�ڹ��� ���α׷����� �ؼ��� ��� Ŭ������ �̸��� ����.
 * 
 * 
 * 
 * 		Event �� ������ ����
 * 		Interface ������ �ʿ����.
 * 		�Ϲ� �޼ҵ� ���ο��� ���Ǻθ� ���� �� ����.
 * 		abstract�� ��� ���� �� ����.
 * 		�������̽��� ��ӹ޾� �����Ҷ��� �� ���� ������.
 * 
 * 
 */

abstract class AbsExam{
	int data = 10000;
	public abstract void printData();
}


public class AnonyInner {

	AbsExam ae = new AbsExam() {
		
		@Override
		public void printData() {
			System.out.println(data);
		}
	};
	
	
	public static void main(String[] args) {
		AnonyInner ai = new AnonyInner();
		ai.ae.printData();
		
	}

}