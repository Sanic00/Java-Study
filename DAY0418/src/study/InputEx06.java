package study ;

/* ������ �� ������ �����ڸ� �Է¹޾� ������� ���α׷��� �����Ͻÿ�.
 * �� ��������ڴ� (+,-,*,/,%)
 * ��� �Է��� BufferedReader�� ó���Ͻÿ�.
 * 
 */

import java.io.*;
public class InputEx06  {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader (System.in));

	
		int a, b = 0;
		char plus, minus, kop, na, per ;
		
		
		System.out.print("ù��° ����  :");
		a = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� :");
		kop = (char)System.in.read() ;
        //System.in.read(); // \r 
		//System.in.read(); // \n
				
		
		System.out.print("�ι�° ����  : ") ;
		b = Integer.parseInt(br.readLine());

		
		System.out.println("a*b="+a*b);
	
		
	}

}

import java.io.*;
public class InputEx06 { 

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader (System.in));

	
		int a, b = 0;
		char plus, minus, kop, na, per ;
		
		
		System.out.print("ù��° ����  :");
		a = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� :");
		kop = (char)System.in.read() ;
        //System.in.read(); // \r 
		//System.in.read(); // \n
				
		
		System.out.print("�ι�° ����  : ") ;
		b = Integer.parseInt(br.readine());

		
		System.out.println("a*b="+a*b);
	
		
	}

}
