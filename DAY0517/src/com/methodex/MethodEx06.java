package com.methodex;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx06 {		
	
	
	
	//Ŭ���� �޼ҵ�
	public static int getInt(String str)throws IOException{
	//�ν��Ͻ� �޼ҵ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(str+":");
		int imsi = Integer.parseInt(br.readLine());
		return imsi ;
	}
		
	public static void main(String[] args) throws IOException{
		MethodEx06 me = new MethodEx06();
	//	int kor = 30 ;
		int kor = getInt("��������");
		System.out.println("����� ���������� "+kor+" �Դϴ�");
		
		
		
	}

}
