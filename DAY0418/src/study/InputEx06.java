package study ;

/* 임의의 두 정수와 연산자를 입력받아 산술연산 프로그램을 구현하시오.
 * 단 산술연산자는 (+,-,*,/,%)
 * 모든 입력은 BufferedReader로 처리하시오.
 * 
 */

import java.io.*;
public class InputEx06  {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader (System.in));

	
		int a, b = 0;
		char plus, minus, kop, na, per ;
		
		
		System.out.print("첫번째 정수  :");
		a = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 :");
		kop = (char)System.in.read() ;
        //System.in.read(); // \r 
		//System.in.read(); // \n
				
		
		System.out.print("두번째 정수  : ") ;
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
		
		
		System.out.print("첫번째 정수  :");
		a = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 :");
		kop = (char)System.in.read() ;
        //System.in.read(); // \r 
		//System.in.read(); // \n
				
		
		System.out.print("두번째 정수  : ") ;
		b = Integer.parseInt(br.readine());

		
		System.out.println("a*b="+a*b);
	
		
	}

}
