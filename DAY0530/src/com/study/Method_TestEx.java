package com.study;
import java.util.*;
class Rect{ // �簢���� ���� Ŭ���� 
	// �Ӽ��� ����� ����
	// �Ӽ�  - �������  ��� - ��� �޼ҵ�
	
	//���� ���� (���� / ����)
	// �������� (Ŭ���� ���� , �ν��Ͻ� ���� )
	int w,h;
	// �޼ҵ� ���� = ����ü�� ���� �� 
	// �޼ҵ� ���� = ��ɱ��� ������ �ִ� �� ��ü�� ������ �ִ°�
	// void ��ȯ�� = ��ȯ ���� ���� ,( ������ ���� ���� )
	// ��ȯ = �޼ҵ� ������ ������� ȣ���� ���� �����ִ� ���� ��ȯ�̶�� �� 
	
	//������������public�� ���� �����ϴ� �׷��� void�� ��
	void input() {
		// �ν��Ͻ�(��ü,��������) ����  -> ���⿡ ����Ǵ� ����...? ���������� �ּҰ�!
		Scanner sc = new Scanner(System.in);
		// System. in �� �� ����?
		//System�� ���� �ǹ��ϳ� -> console�� �ǹ�!! �ֿܼ����� �Է��� �޾ƶ�
		// ��ǻ�Ϳ� ���� �̾��ִ� ���� ��Ʈ���̶�� �Ѵ�. in -inputstream�� ���� �о�´�.
		System.out.print("���� �Է�:");
		w= sc.nextInt();
		System.out.print("���� �Է�:");
		h= sc.nextInt();
	}
	// ���� ���
	/*	 �޼ҵ� ���� �� ����� �ִ� ��� (������ ����)
	 * 	 ���� �ڷ����� int���� ����� 
	 */
	public int area() {
		//public int area�̶�� �ϸ� ������ �ߴµ� �̰��� return ���� �Ȱ����ͼ�!
		// �ƴϸ� ���� ���� ���� �ʴ� void�� ����
		int result  = w*h;
		// �޼ҵ� ȣ��� ������� int������ ���Բ� 
		return	result ;
		/* �޼ҵ�� return ���� ���ؼ��� ������� ��ȯ�Ѵ�. 
		 * 
		 */
	}
	// �ѷ� ���
	int length() {
		int result = 2*(w+h);
		return result;
	}
	// ����� ����ϴ� ��� �޼ҵ� 
	void	print (int a,int b) { // int a,b�� �Ű������� ���ڰ� 
		// �Ű������� ���ڰ��� ���̴�? �����̳� ���̳��� ���� 
		// �Ű������� -  �޼ҵ��� ���� ������ �� �ִ� ���� �����Ҷ� ���̴� �� ���� �������  a = area():
		// ���� ���� -  �޼ҵ带 ȣ���Ҷ� Print(a) - a�� ���ڰ� b= length();
		/* �Ű� ������ ���� �Ѱ� ���� (���� ���� �ʴ� ������ ) */
		System.out.println("���� :"+w);
		System.out.println("���� :"+h);
		System.out.println("����:"+a);
		System.out.println("�ѷ�:"+b);
	}
	}
// ���� Ŭ���� 
public class Method_TestEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r = new Rect(); // ��ü ����
		r.input(); // �޼ҵ� ȣ�� 
		int a = r.area(); // ���� ��� ����� ���� �Ѵ�. 
		int b = r.length(); // �ѷ��� ����� ����� ���� �޴´�. 
		r.print(a, b); // �Ű����� 2�� 
	}
}
