package com.inherit;

class Parent{
	
	int parentVar =10;
	
	void parentMethod() { // �θ��� �޼ҵ� 
		System.out.println("parent Method");
	}
}

class Child	extends Parent{ // �ڳడ �θ𿡰� ��� �޾Ҵ�. 
	
	int childVar =24;
	
	void childMethod() { // �ڳ��� �޼ҵ� 
		System.out.println("child Method");
	}
}

public class ExtendTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		System.out.println(c.parentVar);
		System.out.println(c.childVar);
		c.parentMethod();
		c.childMethod();
		
	}

}
