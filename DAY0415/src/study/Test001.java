package study;
//세과목 (국어,영어,수학)
//문 ) 위의 세 과목의 점수를 입력받아, 총점과 평균을 출력. 프로그램의 구현.
//단, 평균은 소수 2자리까지 출력 !

import java.util.Scanner;
class Test001 {

	public static void main(String[] args) {
		
		int a, b, c ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어값은 ? ") ;
		a = Integer.parseInt(sc.next());
		
		System.out.println("영어값은?") ;
		b = Integer.parseInt(sc.next());
	
		System.out.println("수학값은") ;
		c = Integer.parseInt(sc.next());
	
		
		int total = a+b+c ;
		System.out.println(total);
		
		double aver = (a+b+c)/3 ;
		System.out.printf("%.2f",aver);
	
		sc.close();
		//스캐너 닫는 코드
	}

}
