package com.study;

import java.util.Stack;

public class StackTest {

	private static final String colors[]= {
			"����","���","���","û��","����","���λ�"}; //ť�� ������ ����� ����� �ٸ���(�Է¹��/��¹��) / ť : ���� ���� ���� ���´� / ���� : �������� �� �����Ͱ� ���� ���� ���´�.
	
	
	public StackTest() {
		
		Stack<String> st= new Stack<>();
	
		for(String color : colors) 
			st.push(color);
			popStack(st);
		}
	
	public void popStack(Stack<String>st){
		System.out.println("pop:");
		//������ ��� ���� ������ 
		//pop �ض�
		while (!st.empty()) {
			System.out.println(st.pop());
		}
	}
	
	
	
	public static void main(String[] args) {
		new StackTest();
	}

}
