package com.methodex;

/*	�޼ҵ� ���ǽ� ���ϵ� ������ �ڷ����� '...'��� �����ϹǷ� �̸� ���� �޼ҵ带 �����ϴµ�
 *	�ʿ��� ������ ���� ����(���������� �迭ȭ �۾��� �ڵ����� ����)�ϰ� ������ �� �ִ�. -> ������ ������ ����. 
 * 
 * 
 */

public class VariableEx {

	public void argsTest(String...n) { // n������ ���� �������.�迭�� �κ����� ��)
		for(int i =0 ; i<n.length ; i++) {
			System.out.println("n["+i+"]:"+n[i]);
		}
	}

	public static void main(String[] args) {
		VariableEx ve = new VariableEx();
		ve.argsTest("a","b","c");
		System.out.println();
		ve.argsTest("100","600","1000", "10000");
		
	
	}	

}