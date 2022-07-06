package study;
/*
숨겨진 카드 수를 맞추는 게임

0에서 부터 99까지 임의의 수를 가진 카드를 한장 숨기고
이 카드 수를 맞추는 게임임.
카드속의수가 77이라면 수를 맞추는 사람이 55를 입력하면
더 높게 다시 70을 입력하면 더 높게 라는 식으로 범위를 좁혀가면서
게임을 맞추는 것임.
게임을 반복하기 위해 y/n을 묻고 , n인 경우는 종료함.

컴퓨터가 숨길 수를 임의로 선택하기 위해 Random 클래스를 사용함.
Random 클래스 사용법은 
1.import java.util.*;
2. Random r =new Random();(main()메소드 안에 작성)
int i = r.nextInt(100): 을 의미는 0~99까지의 임의의 정수를 생성
 */

import java.util.*;

public class RandomExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int j = 0;
		// i : 진짜 값(고정값) /j 는 계속 입력하는 값(변하는값)
		int i = r.nextInt(100);

		String str;
		// while (true) {
		// System.out.println("정답을 입력하세요 : ");
		// i = sc.nextInt();
		System.out.println("맞춰보세요 : ");
		// int j = 0;
		while (j < 100) {
			j = sc.nextInt();
			if (i > j) {
				System.out.println("더 큰 수를 입력하세요");
			}
			continue;
			if (i < j) {
				System.out.println("더 작은 수를 입력하세요");
			}
			continue;
			if (i == j) {
				System.out.println("정답입니다. 게임을 진행하시겠습니까?");
				str = sc.next();
				if (str.equals("yes")) {
					i = r.nextInt(100);
					continue;
				} else {

				}
			}
			break;
		}
		// {System.exit(0);break;
	}
}