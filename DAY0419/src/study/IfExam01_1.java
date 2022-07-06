package study;

/*
 * 임의의 정수를 입력 받아 입력받은 수가 짝수인지 판정하시오. (if문)
 * 
 */
import java.util.Scanner;

public class IfExam01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a=0 ;
		
		System.out.print("첫번째 정수 입력:");
		a = sc.nextInt();
		
		if(a%2==0) {
			System.out.println("짝수"); 
			System.out.println("짝수 군요");
		}
		// {}로 묶으면 같은 단위로 범위됨 ! 
			
		else System.out.println("홀수");
		
		
		
		
		
	}

}
