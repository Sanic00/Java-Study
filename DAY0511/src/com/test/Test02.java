package com.test;
/*문]
 * 	양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수중에서
 * 3의 배수만을 출력하는 프로그램을 작성하시오.
 * 
 */
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yang [] = new int[10];
		
		//System.out.println("양의 정수 10개를 입력해라");
		for(int i = 0 ; i<yang.length; i++) {
			System.out.print((i+1)+"번째 정수:");
			yang[i]= sc.nextInt();
			
			//if(yang[i]>0 && yang[i]%3==0)		
			//System.out.print(yang[i]+" ");
			}
			System.out.println();
		System.out.println("3의 배수 : ");
		for(int i = 0 ; i<yang.length; i++) {
			if(yang[i]>0 && yang[i]%3==0)		
				System.out.print(yang[i]+" ");
				}
	
	}
	}


