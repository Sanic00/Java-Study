package com.inherit;
class Sawon{
	String name;
	String dept;
	int salary;
	String displayInfo() {
		return "�̸� :"+name+",�μ� :"+dept+"���� :"+salary;
	}
}
class Sales extends Sawon{
	int commition;
	@Override
	String displayInfo() {
	
		// TODO Auto-generated method stub
		return super.displayInfo()+",����"+commition;
		//super�� �θ��� �޼ҵ� 
	}
}
public class SuperTest {
	public static void main(String[] args) {
		
		Sales s = new Sales();
		System.out.println(s.displayInfo());
	}
}
