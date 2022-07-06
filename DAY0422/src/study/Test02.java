package study;

/*
 * 임의의 알파벳을 입력받아 자음과 모음을 판정하는 프로그램 구현
 * 자음이면 자음이라고 출력, 모음이면 모음이라고 출력
 * 단, 대소문자 모두 적용하고, 알파벳이외의 문자가 입력되면 입력 오류 처리하시오.
 * 
 */

import java.io.*;
public class Test02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		char ch ; //문자를 저장할 변수
		String s ; //결과를 저장할 변수(모음이냐~자음이냐~)

		System.out.println("알파벳 문자 입력:");
		ch = (char)System.in.read(); }
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {// 알파벳인지 아닌지 판정
			if(ch == 'a' || ch == 'e' ||ch == 'o' ||ch == 'i' ||ch == 'u')
			System.out.println("모음");
			else if(ch == 'A' || ch == 'E' ||ch == 'O' ||ch == 'I' ||ch == 'U')
				System.out.println("모음");
			else 				
				System.out.println("자음");
		}else {
			System.out.println("문자 입력 오류 !!!!");					
		}			
	}
}
		/*
		 * s = ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))? (s = ((ch == 'a' || ch ==
		 * 'e' ||ch == 'o' ||ch == 'i' ||ch == 'u') || (ch == 'A' || ch == 'E' ||ch ==
		 * 'O' ||ch == 'I' ||ch == 'U')) ? "모음" : "자음") : "문자 입력 오류 !!!!" ;
		 * 
		 * System.out.println("입력한 알파벳은 "+s+"입니다");
		 * 
		 * 
		 */