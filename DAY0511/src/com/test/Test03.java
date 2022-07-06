package com.test;
/*
 * 문]
 * 
 * 키보드로 돈의 액수를 입력받아 오만원,만원권, 오천원권, 천원권, 500원짜리, 100원짜리동전,
 * 50원짜리 동전, 10원짜리 동전, 1원너짜리 동전으로 변환하는 프로그램을 작성하시오.
 * 단, 배열과 반복문을 활용
 * 배열명 : unit
 * 
 *
 * 
 */
import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		int unit[] = {50000,10000,5000,1000,500,100,50,10,1} ;
		int n ;
		System.out.println("금액을 입력하세요");
		n = sc.nextInt();
		
		for (int i = 0 ; i<unit.length;i++) {
			//동전 개수 계산
			int res = n/unit[i];
	
			// res 몫이 있는 경우 
			if (res > 0) {
				System.out.println(unit[i]+"원짜리:"+res+"개");
				n = n%unit[i]; // money 갱신
				
				
			}
			
			
			/*	n-unit[i]/unit[i+1]
			unit[i] =(n%unit[i])/unit[i] ;
				System.out.print("unit["+i+"]:"+unit[i]);}
		65000 = n 				n/a[1]
(n%a[1])/a[2]		n
						*/
	}
	}
	
}
