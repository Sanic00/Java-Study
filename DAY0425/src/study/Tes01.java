package study;

/* 1. 년도가 4로 나누어 떨어지는 해는 윤년으로 한다.
 * 2. 그 중에서 100으로 나누어 떨어지는 해는 평년으로 함
 * 3. 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정함
 * 
 *1년의 평균날짜는 365.2425 일로 정하여 씀
 *실제 1년보다 0.0003일이 길다.
 *
 *끝나는 날짜 31, 30일, 28일이면 평년
 *29일이면 윤년
 
 */
 
import java.util.*;
 
 public class Tes01 {
	public static void main(String[] args)  {
	
	Scanner sc = new Scanner(System.in);

	int y,m,d ;
	System.out.println("년도 입력 : ");
	y = sc.nextInt();
	
	System.out.println("월 입력 : ");
	m = sc.nextInt();
	
	switch(m) {
	
	case 1: case 3: case 5: case 7:case 8: case 10: case 12: d =31 ;break;
	case 4: case 6: case 9: case 11: d =30 ;break;
	case 2 : 
		if(y%4==0 && y%100!=0 || y%400==0)
			d=29 ;
		else 
			d= 28 ;
		break ;
		
	default :
		d=0 ;
	break ;
	
	}
	if(d!=0) {
		System.out.println(y+"년 "+m+"월은 " +d+"까지 입니다.");
	
	}else {
		System.out.println("입력 오류 !!");
		
	
	}
	
	
	}

}
