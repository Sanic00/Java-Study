package study;

import java.io.*;


public class Homework {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		char ch ;
		String s = "";
				
		System.out.print("���ĺ� ���� �Է� :");
		ch = (char)System.in.read();
		
		s = ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))? 
				(((ch == 'a' || ch == 'e' ||ch == 'o' ||ch == 'i' ||ch == 'u') ||
						(ch == 'A' || ch == 'E' ||ch == 'O' ||ch == 'I' ||ch == 'U')) ?
						"����" : "����") 
				: "���� �Է� ���� !!!!" ;
		
		System.out.println("�Է��� ���ĺ��� "+s+"�Դϴ�");
		
		
		
		
		
		
		
		
	}

}
