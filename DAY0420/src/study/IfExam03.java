package study;

import java.io.*;
public class IfExam03 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
/* 문제 1) 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 양수인지, 음수인지, 0인지를 판정하는 프로그램 구현.
 * 문제 2) 임의의 년도를 입력받아 입력받은 년도가 윤년인지 평년인지를 판정하는 프로그램 구현 
 * 입력은 BufferedReader 
 * if or 삼항연산자 활용
 * 
 * 윤년판정 조건
 * -년도가 4의 배수이면서 100의 배수가 아니거나
 * 400의 배수이면 윤년 그렇치 않으면 평년
 * 
 * 1)중첩if
 *
 *  */
	
		BufferedReader br = new BufferedReader(
				new InputStreamReader (System.in));
	
		
		  int a ;
		  System.out.println("임의의 정수 입력 : "); a = Integer.parseInt(br.readLine());
		  
		  if (a>0) System.out.println("이 정수는 양수입니다"); else if (a == 0)
		  System.out.println("이 정수는 0입니다"); else System.out.println("이 정수는 음수입니다");
		 
;

  System.out.println();
  
  int b ;
  
  System.out.println("올해는 무슨년인가요 ?"); b = Integer.parseInt(br.readLine());
  
  if (b%4==0 && b%100!= 0) System.out.println("윤년입니다"); else if (b%400==0)
  System.out.println("윤년입니다"); else System.out.println("평년입니다");
  
  //System.out.println("입력한 년은");
 	
	System.out.println();
	
	
	int c ;
	String d ;
	
	System.out.println("올해는 무슨년인가요?");
	c = Integer.parseInt(br.readLine());	
	
	
	d = (c%4==0 && c%100!= 0)||(c%400==0) ? "윤년" : "평년" ;
	System.out.println(c+"는"+d+"입니다");
	
	
	}

}
