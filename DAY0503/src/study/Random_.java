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
public class Random_ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r =  new Random();
		
		//변수선언
		// low, high, card
		int low,high,card ;
		
		//y/n  문자열이 들어오면 게임을 반복진행 여부를 판정 
		while (true) {
			int i = 0 ;//사용자의 시행 횟수
			low = 0 ;//카드 값의 최소 범위
			high = 99 ; // 카드 값의 최대 범위
			
			// 0과 99 사이의 정수(난수) 값을 생성(숨김값)
			card = r.nextInt(100);
			System.out.println("숨겨져 있는 카드 값을 맞추어 보세요.");
			
			while(true) {
				System.out.println("입력하실 수 있는 값의 범위"+low+"~~"+high);
				
				int n = 0;
				n = sc.nextInt();// 값을 입력받음.
				//입력한 값이 범위를 벗어난 경우와 정상적인 경우 판정.
				if(n>high||n<low) { // 값이 범위를 벗어난 경우 
					System.out.println("입력하는 값은 범위를 초과하셨습니다.");
				}else {		//값이 정상적인 경우
					if(n==card) {
						System.out.println("맞추셨습니다. 축하드립니다.");
						break;
					}else if(n>card) { // 입력된 값이 숨겨진 카드값보다 큰 경우
						System.out.println("더 낮은 값을 입력하시오.");
						high = n;
					}else { // 입력된 값이 숨겨진 카드값보다 작은 경우
						System.out.println("더 큰 값을 입력하시오.");
						low = n ;
					}			
				}
				i++; //시행 횟수 증가				
			}//안쪽 end while
			System.out.println("계속 게임을 진행 하시겠습니까(y/n)");
			if(sc.next().equals("n"))
				break;				
		}//바깥쪽 end while

}
}