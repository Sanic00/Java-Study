package study;

/*
 *  사용자로부터 하나의 숫자를 입력받은 다음, 그 수만큼 3의 배수를 출력하는 프로그램 작성
 *  만약에 사용자로부터 5를 입력받았다면 3 6 9 12 15를 출력하시오
 */

import java.util.*;
public class WhileExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n, i = 1;
		System.out.print("하나의 숫자를 입력하시오 : ");
		n = sc.nextInt();
		while (i<=n) {
			i++;
		System.out.printf(i*3+" ");
		}
		System.out.println();
	}

}
