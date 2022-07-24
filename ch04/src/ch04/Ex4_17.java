package ch04;

import java.util.Scanner;

public class Ex4_17 {

	public static void main(String[] args) {
		int num = 0;
		
		System.out.print("*을 출력할 라인의 수를 입력하세요>");
		
		Scanner sc = new Scanner(System.in);
		
		String tmp = sc.next();
		num = Integer.parseInt(tmp);
		
		for (int i = 0; i<num; i++) // 1< 10 10번증가 
		{
			for(int j =0; j<=i; j++) // 0<= 1
			{
				System.out.print("*");
			}
			System.out.println();	//줄 바꿈
		}
		
		
			
			
			
			
			
			
			
			
	}

}
