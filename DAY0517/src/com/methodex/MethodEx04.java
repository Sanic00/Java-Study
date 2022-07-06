package com.methodex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx04 {
	
	public static int plus (int x,int y) {
		return x+y ;
	}
	
	public static int min (int x,int y) {
		return x-y ;
	}

	public static int mul (int x,int y) {
		return x*y ;
	}

	public static int div (int x,int y) {
		return x/y ;
	}

	public static int per (int x,int y) {
		return x%y ;
	}
	
	//a:ù��°��, b: ������, c:�ι�°��, d:�����
	public static void disp(int a, char b, int c, int d) { 
	System.out.println("\n"+a+""+b+""+c+"="+d);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//���� ����
		int su1 = 0 ,su2 = 0 , tot = 0 ;
		char yon = 0 ;
		
		System.out.println("ù��° �� : ");
		su1 = Integer.parseInt(br.readLine()); // int���� �޴� ����
	
		//������
		do {
			System.out.println("yon(+,-,*,/,%) : ");
			yon = (char)System.in.read();//character ���� �޴� ����
			System.in.read();
			System.in.read();
			System.in.skip(2);
		} while(yon!='+'&&yon!='-'&&yon!='*'&&yon!='/'&&yon!='%');
		
		
		System.out.println("�ι�° �� : ");
		su2 = Integer.parseInt(br.readLine());
		
		//�����ڸ� �������� �ؼ� ó��.
		System.out.print("�������? :");
		switch (yon) {
		
		case '+':
			//tot = su1 + su2 ;
			tot = plus(su1,su2);
			break;
			
		case '-':
			//tot = su1 - su2 ;
			tot = min(su1,su2);
			break;
		
		case '*':
			//tot = su1 * su2 ;
			tot = mul(su1,su2);			
			break;

		case '/':
			//tot = su1 / su2 ;
			tot = div(su1,su2);
			break;
		
		case '%':
			//tot = su1 % su2 ;
			tot = per(su1,su2);
			break;
		}

		//System.out.println(su1+""+yon+""+su2+"="+tot);
		disp(su1, yon, su2, tot);
	}

}
