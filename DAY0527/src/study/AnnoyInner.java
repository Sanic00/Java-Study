package study;
/*  	Annoymous(�͸�) �̳� Ŭ���� 
 * 		�͸��̶� ? �̸��� ���� �� 
 * 		�ڹ��� ���α׷� ���� �ؼ��� ��� Ŭ���� �̸��� ����. 
 * 		event �� ������ ����
 * 		interface ������ �ʿ� ����
 * 		�Ϲ� �޼ҵ� ���ο��� ���Ǻθ� ���� �� ����
 * 		abstract �� ��� ���� �� ����
 * 		�������̽��� ��ӹ�� �����Ҷ����� �Ѱ��� ������ 
 */
abstract class AbsExam{
	int data = 10000;
	public abstract void printData();
}
public class AnnoyInner { //  ��ü�� ������ �� ���� Ŭ���� 
	AbsExam ae = new AbsExam() {

		@Override
		public void printData() {
			System.out.println(data);
		}
	};
	public static void main(String[] args) {
		AnnoyInner ai = new AnnoyInner();
		ai.ae.printData();
	}		
}
	