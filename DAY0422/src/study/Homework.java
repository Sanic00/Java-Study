package study;

import java.io.*;


public class Homework {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		char ch ;
		String s = "";
				
		System.out.print("알파벳 문자 입력 :");
		ch = (char)System.in.read();
		
		s = ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))? 
				(((ch == 'a' || ch == 'e' ||ch == 'o' ||ch == 'i' ||ch == 'u') ||
						(ch == 'A' || ch == 'E' ||ch == 'O' ||ch == 'I' ||ch == 'U')) ?
						"모음" : "자음") 
				: "문자 입력 오류 !!!!" ;
		
		System.out.println("입력한 알파벳은 "+s+"입니다");
		
		
		
		
		
		
		
		
	}

}
