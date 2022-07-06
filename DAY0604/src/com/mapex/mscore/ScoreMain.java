package com.mapex.mscore;
import java.io.*;
public class ScoreMain {

	public static void main(String[] args) throws IOException{
		
		Score score = new ScoreImpl();
		char ch;
		System.out.println(">>      성적 처리      <<");
		while(true) {
			
			do {
			System.out.print("\n1.입력");
			System.out.print("2.수정");
			System.out.print("3.이름검색");
			System.out.print("4.삭제");
			System.out.print("5.전체출력");
			System.out.print("6.총점");
			System.out.print("7.종료");
			System.out.println("메뉴 선택 : ");
			ch = (char)System.in.read();
			System.in.skip(2);
			
				
			}while(ch<'1'||ch>'7');
			
			switch(ch) {
			case '1' : score.insert();break;
			case '2' : score.update();break;
			case '3' : score.search();break;
			case '4' : score.delete();break;
			case '5' : score.writeAll();break;
			case '6' : score.writeSort();break;
			case '7' : System.exit(0);break;
			
				
			}
		}
		
	}

}
