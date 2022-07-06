package study;


import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt() ;
		switch(month) {
		case 3 :
		case 4: 
		case 5 :
			System.out.println("현재의 계절은 봄입니다");
			break;
		
		case 6 : case 7 : case8 : System.out.println("현재의 계절은 여름입니다");
		break ;
		case 9 : case 10 : case 11 : System.out.println("현재의 계절은 가을입니다");
		break ;
		default :
		case 12 : case 1 : case 2:
		System.out.println("현재의 계절은 겨울입니다");
		
		}
		
		
		
	}

}
