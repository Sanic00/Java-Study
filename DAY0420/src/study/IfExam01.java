package study;

import java.util.Scanner;

/* 
 * 문) 5개의 과목을 점수를 입력받아 총점과 평균을 구하고 평균을 이용하여 학점을 판정하는 프로그램을 구현하시오.
 * 학점A의 점수는 90점 이상
 *		B			80점 이상
		C			70점 이상
		D			60점 이상
		F			60점 미만
 * 
 */
//java.util.scanner ;
public class IfExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in) ;
				
		int a, b, c, d, e ;
		char hak ;
		
		System.out.println("국어점수 : ");
		a = sc.nextInt() ;
		
		System.out.println("수학점수 : ");
		b = sc.nextInt() ;
		
		System.out.println("영어점수 : ");
		c = sc.nextInt() ;
		
		System.out.println("사회점수 : ");
		d = sc.nextInt() ;
		
		System.out.println("과학점수 : ");
		e = sc.nextInt() ;
		
		int sum = a+b+c+d+e ;
		int avg = (a+b+c+d+e)/5 ;
		
		System.out.println("총점은"+sum+"입니다");
		System.out.println("평균은"+avg+"입니다");
		
		if(avg >=90) {
			hak = 'A' ;
		}else if (avg >=80) {
			hak = 'B' ;
			//System.out.println("B");
		}else if (avg >=70) {
			hak = 'C' ;
			//System.out.println("C");
		}else if (avg >=60) {
			hak = 'D' ;
			//System.out.println("D");
		}else hak = 'F' ;		
	}
		//System.out.println("당신의 학점은"+hak+"입니다.") ;
}
