package com.inherit;
/*	�������̵��� ������ �� �ִ� ��Ģ
 * - �θ� Ŭ������ �ڽ� Ŭ���� ���̿����� �����Ѵ�. 
 * - static �޼ҵ�� Ŭ������ ���ϴ� �޼ҵ� �̱⶧���� ��� ��ü�� �ȵȴ�. ���� ���ٶ��̵��� �� �� ����.
 * - ���������ڰ� private�� ���ǵ� �޼ҵ�� ��� ��ü�� ���� �ʴ´�. 
 * - interface �� �����ؼ� �޼ҵ带 �������̵� �Ҷ��� ���������ڸ� public���� ���� �ؾ��Ѵ�. 
 * - // �߻�޼ҵ嵵 public �̾� 
 * - �޼ҵ��� ������ ������ Ÿ���� ���� ��ġ�ؾ��ϰ� ����Ÿ�Ա��� ��ġ�ؾ��Ѵ�.
 * - �θ�Ŭ������ �޼ҵ��� ���� �����ں��� �� ������ �� ����.
 * - //public>protected>default>private 
 * - �θ� Ŭ������ �޼ҵ庸�� �� ���� ���ܸ� ���� �� ����(���ܸ� ������ -��������). -> ����ó���� ���� ��� ����
 * - final(�����) ������ �޼ҵ�� �������̵� �� �� ����. 
 * 
 */
class OverridingParent{
	void parentMethod() {
		System.out.println("Parent Method...");
	}
}
class OverridingChild extends OverridingParent{ // ���
	// �������̵��� ��ȯ��,�޼ҵ�� �ǵ帮�� �ʱ�!
	
	@Override
	void parentMethod() {
		// TODO Auto-generated method stub
		System.out.println("childMethod..."); //�ڽ��� �Ը��� �°� �ٲٴ°�
	}
}
public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild cc = new OverridingChild();
		cc.parentMethod(); // ������ �°Բ� �丮 
	}
}
