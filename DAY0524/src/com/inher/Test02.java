package com.inher;
import java.util.*;
class Book{
	
	static int count ;
	String title   ;
	int score  ;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
	return "Book[title="+title+",score="+score+"]";
	}
	
	public Book(String title , int score) {
		this.title =  title ;
		this.score = score ;
		count++ ;
	}	
}

public class Test02 {

	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<Book>(); // <> 안에는 객체만 들어갈 수 있음.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==============================");
			System.out.println("1. 책 등록");
			System.out.println("2. 책 검색");
			System.out.println("3. 모든 책 출력");
			System.out.println("4. 종료");
			System.out.println("==============================");
			
			System.out.print("메뉴 선택 :");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("책 제목:");
				String title = sc.next();
				System.out.println("책 평점");
				int score = sc.nextInt(); 
				list.add(new Book(title,score));
				break;
			case 2 :
				System.out.println("책 제목 : ");
				String title2 = sc.next();
				
				for(Book e :list) {
					if(e.getTitle().equals(title2)) {
						System.out.println(e);//
					}
				}
			case 3 :
				for(Book e :list) {
						System.out.println(e);//
				}
				break ;
				
			case 4 : 
				System.out.println("프로그램을 종료합니다.\n");
				return ;
			}	
		}
		
		//add 와 스캐너 이용
	}

}
