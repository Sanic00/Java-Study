package study;

/*
 * 임의의 정수를 입력 받아 입력받은 수가 짝수인지 판정하시오. (if문)
 * 
 */
import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a,b  ;
		char op ; 
		String s ;
		
		  System.out.print("첫번째 정수 입력:"); 
		  a = sc.nextInt();
		  
		  System.out.print("연산자 입력 : "); 
		  op = sc.next().charAt(0); // scanner는 기본 문자열이기때문에 sc.next()다음에 .charAt(0)을 추가해줘야지 오류가 안뜸. //s = sc.next(); (string으로 잡을 때)
		  
		  System.out.print("두번째 정수 입력:"); b = sc.nextInt();
		 
		
		
		if(op == '+') {
		//if(s == "+") {
		//if(s.equals("+")) { string일때 ,==을 .equals로 표현가능.
			
		System.out.printf("%d %c %d = %d\n", a, op, b, (a+b));
		}else if(op == '-') {
			System.out.printf("%d %c %d = %d\n", a, op, b, (a-b));
		}
		else if (op == '*'){
			System.out.printf("%d %c %d = %d\n", a, op, b, (a*b));		
		}
		else if( op == '/') {
			System.out.printf("%d %c %d = %d\n", a, op, b, (a/b));
		}
		else if( op == '%') {
			System.out.printf("%d %c %d = %d\n", a, op, b, (a%b));
		}else {
			System.out.println("연산자가 아닙니다.");
		}
		//다중 if문
		
	}

}
