package q;

		class FinalClass{
		 protected final int finalMethod() {
			 return 0;
		 }
		 class SubClass extends FinalClass{
			//protected int finalMethod() {return0;} 
		 }
	 }
		/*
		 * class Subcalss extends FinalClass{ //final�� ����� �Ұ��� �ϴϱ�..! }
		 */
public class B {
	public int n ;
	public void g() {
		n=5;
	}
	// ���� public���� private���� �ٲ۴ٸ�?
	// private�� ������ �Ұ����ϴ� ������ ��Ű�� �������� �ٸ� Ŭ���������� ������ �Ұ��� �ϴ� 
	
	// ���� protected���
	// ���� ��Ű�������� ������ ���������� �ٸ� ��Ű���� ��� ������ �Ұ����ϴ� 
	
	// ���������ڸ� �����ϴ� ���� default �̴�. ������ ��Ű�� ���� �ִ� Ŭ������ ���� ���� 
	// �ٸ� ��Ű���� �ִ°� ������ �Ұ����ϴ�. 
}
