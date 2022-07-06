package study;

/*
 * 문]
 * 사용자가 입력하는 정수를 계속해서 더해 나간다.
 * 만약에 0이 입력되면 지금까지 입력된 정수의 합계를 출력하고 종료하는 프로그램을 구현하시오.
 * 단, while문 이용
 * 
 */

import java.util.Scanner;
public class WhileExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i, sum ;
		i = sum = 0 ;
		System.out.println("정수를 입력하여라");
		
		while(i>=0) {
		if(i>0)
		sum += i ;
		i ++ ;
		i = sc.nextInt();
		if (i==0) 
			break ;}
			System.out.println("정수의 합계는"+sum);
	}


	
}
