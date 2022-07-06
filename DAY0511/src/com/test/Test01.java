package com.test;
/*
 *문]
 * 
 * 학생 수를 입력받아 입력받은 인원수 만큼 학생의 이름과 전화번호를 입력받고
 * 입력 받은 내용 전체를 출력하는 프로그램을 작성하시오.
 * 단, 배열을 이용하여 작성하시오 
 * 
 */

import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
				
		int n ;
		System.out.println("학생수: ");
		n = sc.nextInt();


		String[] name = new String[n] ;
		String[] phone = new String[n];

				
		for(int i =0 ; i < name.length ; i++) {
			System.out.println("이름     전화번호 입력 ("+(i+1)+"  :   [공백구분]:");
			name[i] = sc.next();
			phone[i] = sc.next();
			}
				
			System.out.println();
			System.out.println("----------------------------");
			System.out.println(" 입력받은 학생수 : "+n+"명");
			System.out.println("----------------------------");
			System.out.println(" 이 름             전화번호 ");
			for(int i =0 ; i < name.length ; i++) {
			System.out.println(name[i] +"          "+phone[i]);
			}
			System.out.println("----------------------------");
		
	}

}
