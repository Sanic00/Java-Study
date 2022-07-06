package study;

/*
 * 문]
 * 사용자가 입력하는 정수를 계속해서 더해 나간다.
 * 만약에 0이 입력되면 지금까지 입력된 정수의 합계를 출력하고 종료하는 프로그램을 구현하시오.
 * 단, while문 이용
 * 
 */

import java.util.Scanner;
public class WhileExam01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = 1 , sum =0 ;
		
		while(true) { // while (n ! =0 ) 으로 잡아도 됨.
		
			System.out.print("정수 입력(0:종료):");
			n = sc.nextInt();
			if(n==0)
				break;
			sum+=n;
					
		}
		System.out.println("지금까지의 합계:"+sum);
		}
	
}
