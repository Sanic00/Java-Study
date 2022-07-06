package study;

/*Scanner를 이용하여 소문자 알파벳을 하나 입력 받고
 * 다음과 같이 출력하는 프로그램을 작성하시오.
 * 알파벳 입력 : e 
 * abcde
 * abcd
 * abc
 * ab
 * a
 * 
 */

import java.util.*;
public class ForExam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		char i,j ;
		char c = ' ' ;
		c = sc.next().charAt(0);
		
		for(i=c ; i>='a' ; i--) {
			for(j='a' ; j<=i ; j++) {
					System.out.print(j);}
			System.out.println();
			}
		}
			
	}

