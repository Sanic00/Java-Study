package com.inherit;
	class Sawon2{
		
		String name;
		String dept;
		int salary;
		public Sawon2() {
			// TODO Auto-generated constructor stub
		}
	
		public Sawon2(String name,String dept,int salary) {
			super(); // �̰� �� �ɱ�? object�� �����ڶ� 
			this.name= name;
			this.dept=dept;
			this.salary=salary;
		}
		String displayInfo() {
			return "�̸� :"+name+"�μ� :"+dept+"���� :"+salary;
		}
	}
	class Sales2 extends Sawon2{
		// ���⿡ �⺻�����ڰ� ������ ������ ����!
		int commition;
		public Sales2(String name,String dept,int salary,int commition) {
			// TODO Auto-generated constructor stub
			super(name,dept,salary); // �ٸ������ڸ� ȣ���Ҷ��� ��ù���̴�! 
			this.commition=commition;
		}
		@Override
		String displayInfo() {
			// TODO Auto-generated method stub
			return super.displayInfo()+"����"+commition;
		}
	}
public class SuperConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sales2 se = new Sales2("ȫ�浿", "���ߺ�", 1000000000, 5000000);
		System.out.println(se.displayInfo());
	}

}
