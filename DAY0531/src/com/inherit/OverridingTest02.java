package com.inherit;
class OverridingParent2{
	int money =20; 
	void parentMethod() {
		System.out.println("Parent Method...");
	}
}
class OverridingChild2 extends OverridingParent2 {
	String money ="20��";
	@Override
	void parentMethod() {
		System.out.println("overriding method...");
	}
}
public class OverridingTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild2 oc2 = new OverridingChild2();
		oc2.money ="30��"; // int������ String���� �ٲ�� ������ 
		//oc2.money = 10; �̶�� �ϸ� ������ ����. // �θ� 
		// ������ ���Ƶ� �ȴ�!  �θ� ������ �ִ°� �������� �ȴ�. �������� ������ �ν��ϰ� �ȴ�!
		// �ڷ����� ���� ���� �����ϴ� private�� �ƴ϶��..!
		System.out.println(oc2.money);
	}
}
