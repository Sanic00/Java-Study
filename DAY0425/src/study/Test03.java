package study;
import java.util.*;
public class Test03 {
	/*
	 * 문제 ) 사칙 연산을 입력받아 게산하는 프로그램을 작성하시오. 연산자는 +,-,*,/ 네가지로 모두 실수로 처리함 
	 * 피연산자와 연산자는 빈칸으로 분리하여 입력. 0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료함 switch ~case 문을 이용하여 작성
	 * 연산자는 Scanner를 사용하여 문자열로 입력받으시오.
	 */	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	double a, b, c = 0 ;
	char op ;
	
	System.out.print("연산은? : ");
	a = sc.nextInt();	
	op = sc.next().charAt(0);	
	b = sc.nextInt();
	
	
	switch (op) {
	case '+':
		c = a+b;
		break;

	case '-':
		c = a-b;
		break;
		
	case '*':
		c = a*b;
		break;
		
	case '/':
		if(b==0)
			System.out.println("0으로 나눌 수 없습니다");
		else c=a/b;
		return;
		//break;
		
	default:
		System.out.println("사칙연산이 아닙니다");
		//break;
	}
	System.out.println(a+" "+op+" "+b+ "=" +c);
}
}